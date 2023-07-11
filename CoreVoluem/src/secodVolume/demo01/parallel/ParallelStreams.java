package secodVolume.demo01.parallel;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.*;

/**
 * @author 烂醉花间
 * @date 2023/7/11  21:55
 */
public class ParallelStreams {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("E:/学习/JAVA/项目/corejava11/corejava/gutenberg/alice30.txt")), StandardCharsets.UTF_8);
        List<String> wordList = List.of(contents.split("\\PL+"));

        var shortWords = new int[10];
        wordList.parallelStream().forEach(s -> {
            if (s.length()<10) shortWords[s.length()]++;
        });
        System.out.println(Arrays.toString(shortWords));

        Arrays.fill(shortWords, 0);
        wordList.parallelStream().forEach(s -> {
            if (s.length()<10) shortWords[s.length()]++;
        });
        System.out.println(Arrays.toString(shortWords));

        Map<Integer, Long> shortWordCounts = wordList.parallelStream().filter(s -> s.length() < 10)
                .collect(groupingBy(String::length, counting()));
        System.out.println(shortWordCounts);

        Map<Integer, List<String>> result = wordList.parallelStream().collect(groupingByConcurrent(String::length));
        System.out.println(result.get(14));

        result = wordList.parallelStream().collect(groupingByConcurrent(String::length));
        System.out.println(result.get(14));

        Map<Integer, Long> collect = wordList.parallelStream().collect(groupingByConcurrent(String::length, counting()));
        System.out.println(collect);


    }
}
