package demo09.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 烂醉花间
 * @date 2023/3/30  22:12
 */
public class SetTest {
    public static void main(String[] args) {
        var words = new HashSet<String>();
        long totalTime = 0;


        try (var in = new Scanner(System.in)) {
            while (in.hasNext()&&words.size()<=20) {
                String word = in.next();
                long millis = System.currentTimeMillis();
                words.add(word);
                millis = System.currentTimeMillis() - millis;
                totalTime += millis;
            }
        }

        Iterator<String> iterator = words.iterator();
        for (int i = 0; i <= 20 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
        System.out.println("....");
        System.out.println(words.size() + "distinct words. " + totalTime + " milliseconds.");
    }
}
