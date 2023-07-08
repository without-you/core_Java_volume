package firstVolume.demo03;

import java.util.Scanner;

/**
 * 从n个数字中取k个数字来抽奖，有多少种组合。
 * @author 烂醉花间
 * @date 2022/11/28/22:10
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("你希望取多少个数字抽奖？：");
        int k = scanner.nextInt();

        System.out.print("你希望从多少个数字中抽取？：");
        int n = scanner.nextInt();

        //数字组合的数量
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("你需要从"+lotteryOdds+"种组合中答对1种。祝你幸运");
    }
}
