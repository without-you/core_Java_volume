package firstVolume.demo08.pair1;

import firstVolume.demo08.Pair;

/**
 * @author 烂醉花间
 * @date 2023/3/25  22:18
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = new String[]{"Marry","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min= "+mm.getFirst());
        System.out.println("max= "+mm.getSecond());
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a){
        String min = a[0];
        String max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i])>0) min = a[i];
            if (max.compareTo(a[i])<0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}

