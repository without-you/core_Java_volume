package prod;

public class Test1 {
    public static void main(String[] args) {
        int[][] arrays = new int[5][4];

        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                arrays[row][col] = row*4 + col + 1;
            }
        }

        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                System.out.print(arrays[row][col]+" ");
            }
            System.out.println();
        }

    }
}
