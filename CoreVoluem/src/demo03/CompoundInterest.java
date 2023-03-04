package demo03;

/**
 * 银行存款不同利率下的每年余额的变化
 * @author 烂醉花间
 * @date 2022/12/1/22:27
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        //不同的利率
        final int NARTES = 6;
        //年数
        final int NYEARS = 10;

        //存储不同的利率10%-15%
        double[] interestRate = new double[NARTES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }
        //存储初始值为1000时，以及不同利率下的每年余额的变化
        double[][] balances = new double[NYEARS][NARTES];
        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 1000;
        }
        //计算每年余额的变化，默认余额为初始值，从下一年进行改变因此i从1开始
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                //上一年的余额
                double oldBalance = balances[i - 1][j];
                //获得的利息
                double interest = oldBalance * interestRate[j];
                //对对应利率下的余额进行改变
                balances[i][j] = oldBalance + interest;
            }
        }

        //格式化打印内容
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100 * interestRate[i]);
        }
        System.out.println();
        for (double[] balance : balances) {
            for (double v : balance) {
                System.out.printf("%10.2f", v);
            }
            System.out.println();
        }
    }
}
