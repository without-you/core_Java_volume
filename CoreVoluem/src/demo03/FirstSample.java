package demo03;

import java.util.Scanner;

/**
 *这是每个编程的的第一步，来打个招呼
 *public Java中修饰符的一种，控制程序的其他部分对此修饰符修饰代码的访问权限，访问权限最开放
 *class Java中的一个关键字，形容是一个类，Java程序中的所有内容都应当放入类
 *FirstSample 类名，类名需要和文件名一致，类、方法、变量名命名需注意符合Java命名规范
 * @author 烂醉花间
 * @date 2022/11/21/21:35
 */
public class FirstSample {
    /**
     * main方法是java中非常重要的方法，Java虚拟机总是从指定类中的main方法开始执行，因此main方法的修饰符必须为public
     * static Java中的一个关键字，形容为静态，可加在方法前，类前，变量前
     * void Java中的一个关键字，代表方法的返回值为空
     */
    public static void main(String[] args) {
        //System.out.println() 控制台打印方法，可将（）中的内容打印到控制台中
        //java中代表一句结束时使用 ';'
        System.out.println("Hello World!");
    }
}

