package firstVolume.demo05.objectAnalyzer;

import java.util.ArrayList;

/**
 * @author 烂醉花间
 * @date 2023/3/4  18:40
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws IllegalAccessException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
