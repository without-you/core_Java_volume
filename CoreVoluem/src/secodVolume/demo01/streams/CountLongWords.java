package secodVolume.demo01.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author 烂醉花间
 * @date 2023/7/8  15:51
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        var contents = new String(Files.readAllBytes(
                Paths.get("E:/学习/JAVA/项目/corejava11/corejava/gutenberg/alice30.txt")
        ), StandardCharsets.UTF_8);

        List<String> words = List.of(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12) {
                count++;
            }
        }
        System.out.println(count);
        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
    }
}
