package firstVolume.demo03;

import java.util.Scanner;

/**
 * @author 烂醉花间
 * @date 2022/11/28/21:32
 */
public class Retirement2 {
    public static void main(String[] args) {
        //read inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("你希望有多少退休金？：");
        double goal = scanner.nextDouble();

        System.out.print("你每年准备存放多少钱？：");
        double payment = scanner.nextDouble();

        System.out.print("利率是多少 %：");
        double interestRate = scanner.nextDouble();

        double balance = 0.0;
        int years = 0;

        String input = "N";
        //不断更新存款，直到满足条件
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            //打印余额。
            if (balance > goal){
                System.out.println("过了"+years+"年，现在有："+String.format("%.2f", balance)+"退休金。");
                //询问是否退休
                System.out.print("现在退休吗？(Y/N)：");
                input = scanner.next();
            }
        } while (input.equals("N"));
    }
}
