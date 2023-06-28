package p03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

    public static void main(String[] args) {
        System.out.print("1~45까지의 숫자를 6개 입력해라 : ");
        Random rdm = new Random();
        int[] lotto = new int[6];

        for(int i=0; i<lotto.length; i++) {
            int rNum = rdm.nextInt(45) + 1;
            for(int j=0; j<i; j++) {
                if(lotto[j]==rNum) {
                    i--;
                    break;
                }
            }
            if(lotto[i]==0) {
                lotto[i] = rNum;
            }

        }


        Scanner scan = new Scanner(System.in);
        String lottoStr = scan.nextLine();
        String[] strs = lottoStr.split(",");
        int count = 0;


        for(int i=0; i<strs.length; i++) {
            for(int k=0; k<6; k++) {
                if(lotto[k] == Integer.parseInt(strs[i])){
                	count++;
                }
            }
        }

        System.out.println("맞춘 개수 : " + count);
    }
}
