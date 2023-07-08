package firstVolume.demo09.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 烂醉花间
 * @date 2023/4/3  19:48
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        List<Integer> subList = numbers.subList(0, 6);
        Collections.sort(subList);
        System.out.println(subList);
    }
}
