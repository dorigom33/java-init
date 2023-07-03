package p06;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {

        Random random = new Random();
        int[] pitch = new int[3];

        for (int i=0;i<pitch.length;i++) {
            int bNum = random.nextInt(10);
            pitch[i] = bNum;
            for(int j=0; j<pitch.length; j++) {
                if(pitch[i]==pitch[j]) {
                    i--;
                    break;
                }

            }

        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자가 뭐야? : ");
        String pitchStr = scanner.nextLine();
        String[] pitchStrs = pitchStr.split(",");
        
        int[] compNums = new int[pitchStrs.length];
        int strike = 0;
        int ball = 0;
        for (int i=0; i< pitch.length;i++){
            compNums[i] = Integer.parseInt(pitchStrs[i]);
        }
        for(int i=0;i<pitch.length;i++) {
            System.out.println(pitch[i] + ",");

        }
        System.out.println("스트라이크 : " + strike);
        System.out.println("볼 : " + ball);

    }
}
