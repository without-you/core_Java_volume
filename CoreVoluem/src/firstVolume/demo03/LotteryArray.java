package firstVolume.demo03;

/**
 * 不规则数组生成杨辉三角
 * @author 烂醉花间
 * @date 2022/12/1/22:46
 */
public class LotteryArray {
    public static void main(String[] args) {
        //最大行数
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        //每一行的长度都不相同
        for (int i = 0; i <= NMAX; i++) {
            odds[i] = new int[i + 1];
        }
        //赋值
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }
        //格式化输出
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
