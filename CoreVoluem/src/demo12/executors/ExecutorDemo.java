package demo12.executors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 烂醉花间
 * @date 2023/5/1  16:56
 */
public class ExecutorDemo {
    public static long occurrences(String word, Path path) {
        try (var in = new Scanner(path)) {
            int count = 0;
            while (in.hasNext()) {
                if (in.next().equals(word)) {
                    count++;
                }
            }
            return count;
        } catch (IOException e) {
            return 0;
        }
    }

    public static Set<Path> descendants(Path rootDir) throws IOException {
        try (Stream<Path> entries = Files.walk(rootDir)) {
            return entries.filter(Files::isRegularFile)
                    .collect(Collectors.toSet());
        }
    }

    public static Callable<Path> searchForTask(String word, Path path) {
        return () -> {
            try (var in = new Scanner(path)) {
                while (in.hasNext()) {
                    if (in.next().equals(word)) {
                        return path;
                    }
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Search in " + path + " canceled. ");
                        return null;
                    }
                }
            }
            throw new NoSuchFieldException();
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        try (var in = new Scanner(System.in)) {
            System.out.println("Enter base directory (e.g. /opt/jdk-9-src):");
            String start = in.nextLine();
            System.out.println("Enter keyword (e.g. volatile): ");
            String word = in.nextLine();

            Set<Path> files = descendants(Path.of(start));

            var tasks = new ArrayList<Callable<Long>>();
            for (Path file : files) {
                Callable<Long> task = () -> occurrences(word, file);
                tasks.add(task);
            }

            ExecutorService executorService = Executors.newCachedThreadPool();
            Instant startTime = Instant.now();
            List<Future<Long>> results = executorService.invokeAll(tasks);
            long total = 0;
            for (Future<Long> result : results) {
                total += result.get();
            }
            Instant endTime = Instant.now();

            System.out.println("Occurrences of" + word + ": " + total);
            System.out.println("Time elapsed: " + Duration.between(startTime, endTime).toMillis() + "ms");

            var searchTask = new ArrayList<Callable<Path>>();
            for (Path file : files) {
                searchTask.add(searchForTask(word, file));
            }
            Path found = executorService.invokeAny(searchTask);
            System.out.println(word + "occurs in:" + found);

            if (executorService instanceof ThreadPoolExecutor) {
                System.out.println("Largest pool size: " + ((ThreadPoolExecutor) executorService).getLargestPoolSize());
            }
            executorService.shutdown();
        }
    }
}
