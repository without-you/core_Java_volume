package secodVolume.demo01.collecting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 烂醉花间
 * @date 2023/7/8  17:28
 */
public class CollectingResults {
    public static Stream<String> noVowels() throws IOException {
        var contents = new String(Files.readAllBytes(
                Paths.get("E:/学习/JAVA/项目/corejava11/corejava/gutenberg/alice30.txt"))
                , StandardCharsets.UTF_8);
        List<String> wordList = List.of(contents.split("\\PL+"));
        Stream<String> words = wordList.stream();
        return words.map(s -> s.replaceAll("[aeiouAEIOU]", ""));
    }

    public static <T> void show(String label, Set<T> set) {
        System.out.println(label + ": " + set.getClass().getName());
        System.out.println("["
        +set.stream().limit(10).map(Object::toString).collect(Collectors.joining(", "))
        +"]");
    }

    public static void main(String[] args) throws IOException {
        Iterator<Integer> iter = Stream.iterate(0, n -> n + 1).limit(10).iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Object[] numbers = Stream.iterate(0, n -> n + 1).limit(10).toArray();
        System.out.println("Object array:" + numbers);

        try {
            var number = (Integer) numbers[0];
            System.out.println("number: " + number);
            System.out.println("The following statement throws an exception:");
            var numbers2 = (Integer[]) numbers;
        } catch (ClassCastException ex) {
            System.out.println(ex);
        }

        Integer[] numbers3 = Stream.iterate(0, n -> n + 1).limit(10)
                .toArray(Integer[]::new);
        System.out.println("Inter array: " + numbers3);

        Set<String> noVowelsTreeSet = noVowels().collect(Collectors.toCollection(TreeSet::new));
        show("noVowelsSet", noVowelsTreeSet);

        IntSummaryStatistics summary = noVowels().limit(10).collect(
                Collectors.summarizingInt(String::length)
        );

        double average = summary.getAverage();
        double max = summary.getMax();
        System.out.println("Average word length: " + average);
        System.out.println("Max word length: " + max);
        System.out.println("forEach:");
        noVowels().limit(10).forEach(System.out::println);
    }
}
