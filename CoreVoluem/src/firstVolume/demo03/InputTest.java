package firstVolume.demo03;
//使用Scanner类需要进行包导入
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author 烂醉花间
 * @date 2022/11/24/22:32
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //获取第一次输入
        System.out.print("你的姓名是什么？：");
        String name = scanner.next();
        //获取第二次输入
        System.out.print("你的年龄是多少？：");
        int age = scanner.nextInt();
        //将结果拼接输入
        System.out.println("Hello，"+name+"。明年你就"+(age+1)+"岁了");

        Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
        PrintWriter writer = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);
    }
}
