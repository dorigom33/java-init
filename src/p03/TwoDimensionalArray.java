package p03;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numsArray = new int[3][3];
        System.out.println(numsArray.length);

        for (int i = 0; i < numsArray.length; i++) {
            for (int j = 0; j < numsArray[i].length; j++) {
                numsArray[i][j] = (i * numsArray[i].length) + (j + 1);
            }
        }

        for (int i = 0; i < numsArray.length; i++) {
            for (int j = 0; j < numsArray[i].length; j++) {
                System.out.print(numsArray[i][j]);
            }
        }
    }
}
