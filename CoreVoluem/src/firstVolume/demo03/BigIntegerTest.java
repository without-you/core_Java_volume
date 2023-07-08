package firstVolume.demo03;

import java.math.BigInteger;

/**
 * 抽奖程序的改进，从490个可能的数值中抽取60个
 * @author 烂醉花间
 * @date 2022/11/30/21:51
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        //取多少个数字抽奖？
        BigInteger bihK = BigInteger.valueOf(60);
        //从多少个数字中抽取？
        BigInteger bihN = BigInteger.valueOf(490);
        //数字组合的数量
        BigInteger lotteryOdds = new BigInteger("1");
        for (int i = 1; i <= bihK.intValue(); i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            lotteryOdds = lotteryOdds.multiply(bihN .subtract(bigI).add( BigInteger.valueOf(1))).divide(bigI);
        }
        System.out.println("你需要从"+lotteryOdds+"种组合中答对1种。祝你幸运");
    }
}
