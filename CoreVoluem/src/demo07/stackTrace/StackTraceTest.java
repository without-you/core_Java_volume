package demo07.stackTrace;

import java.util.Scanner;

/**
 * @author 烂醉花间
 * @date 2023/3/23  20:21
 */
public class StackTraceTest {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)){
            System.out.println("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }

    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        StackWalker stackWalker = StackWalker.getInstance();
        stackWalker.forEach(System.out::println);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }
}
