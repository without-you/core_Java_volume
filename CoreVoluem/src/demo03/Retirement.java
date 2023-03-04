package demo03;

import java.util.Scanner;

/**
 * @author 烂醉花间
 * @date 2022/11/28/21:32
 */
public class Retirement {
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

        //不断更新存款，直到满足条件
        while (balance<goal){
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("攒到你想要的退休金需要："+years + "年。");
    }
}
