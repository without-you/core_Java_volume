package firstVolume.demo03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 利用数组进行抽奖，抽出指定长度的元素，并且完全不重复
 * @author 烂醉花间
 * @date 2022/12/1/22:04
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("你想要抽出多少个数字？：");
        int k = scanner.nextInt();
        System.out.print("你想要从多少个数字中抽取？：");
        int n = scanner.nextInt();
        //对程序的健壮性进行简单的增强
        if (k>n){
            System.out.println("抽取的数字个数必须小于抽取范围");
            return;
        }
        //初始化一个数组来装需要抽奖的奖池
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        //初始化一个数组用来装抽出的数字
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //r是用来获取奖池数字的下标，范围在奖池数组的长度，即是n。random方法是获取一个0和1的之间随机数，且永远不会是0或1。
            //意味者不可能会抽到最后一位下标对应的元素，和下面的代码结合就可保证抽取到的每个元素都不会重复。
            int r = (int) (Math.random() * n);
            //将奖池对应下标的元素放到结果集数组中
            result[i] = numbers[r];
            //为确保不会再次抽到这个值，使用数组最后一位覆盖将此下标对应的元素覆盖掉，并将抽奖范围缩小
            numbers[r] = numbers[n - 1];
            n--;
        }
        //对结果数组进行排序
        Arrays.sort(result);
        System.out.println("这是此次抽奖的结果，祝你好运。");
        //toString方法可以直接将数值型数组元素直接输出
        System.out.println(Arrays.toString(result));
    }
}
