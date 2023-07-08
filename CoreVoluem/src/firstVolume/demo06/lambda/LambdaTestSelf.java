package firstVolume.demo06.lambda;

/**
 * @author 烂醉花间
 * @date 2023/3/26  22:06
 */
public class LambdaTestSelf {
    public static void main(String[] args) {
        LambdaTestInterface lambdaTestInterface = (e) -> {
            System.out.println("LambdaTestInterface"+e);
        };

//        lambdaTestInterface.method2("方法2");
    }
}
