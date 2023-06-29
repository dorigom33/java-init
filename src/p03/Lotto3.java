package p03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 45까지의 수를 6개 입력 : ");
        String lottoStr = scanner.nextLine();

        String[] strs = lottoStr.split(",");
        int[] rNum = new int[strs.length];
        for (int i=0; i< strs.length; i++){
            rNum[i] = Integer.parseInt(strs[i]);
        }

        Random random = new Random();
        int[] lotto = new int[6];
        for(int i=0; i< lotto.length;i++){
            lotto[i] = random.nextInt(45)+1;
        }

        System.out.println("로또 번호 : " + Arrays.toString(lotto));
        System.out.println("니가 입력한 번호 : " + Arrays.toString(rNum));

        int count = 0;
        for(int i=0; i< lotto.length; i++){
            for(int j=0; j<rNum.length; j++){
                if(lotto[i] == rNum[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count + "개 맞췄다!");
    }
}

