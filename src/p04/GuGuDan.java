package p04;

import java.util.Scanner;

public class GuGuDan {
    public static void printGuGuDan() {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        for(int i=1; i<=row; i++) {
            for(int j=1;j<=col;j++) {
                System.out.print(i + "x" + j + "=" + i*j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.print("row : ");
        System.out.println();
        System.out.print("col : ");
        printGuGuDan();
    }
}