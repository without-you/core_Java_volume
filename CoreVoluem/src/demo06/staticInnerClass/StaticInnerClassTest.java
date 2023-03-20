package demo06.staticInnerClass;

/**
 * @author 烂醉花间
 * @date 2023/3/20  22:44
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] values = new double[20];
        for (int i = 0; i < 20; i++) {
            values[i] = Math.random() * 100;
        }
        ArrayAlg.Pair pair = ArrayAlg.minmax(values);
        System.out.println("min=" + pair.getFirst());
        System.out.println("max=" + pair.getSecond());
    }
}

class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
