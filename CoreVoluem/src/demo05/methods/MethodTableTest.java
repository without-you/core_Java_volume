package demo05.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 烂醉花间
 * @date 2023/3/4  19:39
 */
public class MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    public static double square(double x){
        return x * x;
    }
    private static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        System.out.println(f);

        double dx = (to - from) / (n - 1);
        for (double i = from; i <= to; i+=dx) {
            double y = (double) f.invoke(null, i);
            System.out.printf("%10.4f | %10.4f%n", i, y);
        }
    }
}
