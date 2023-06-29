package p03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 45까지의 수를 6개 입력 : ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        int[] userNumbers = new int[numbers.length];
        for (int i=0; i< numbers.length; i++){
            userNumbers[i] = Integer.parseInt(numbers[i]);
        }

        Random random = new Random();
        int[] lotto = new int[6];
        for(int i=0; i< lotto.length;i++){
            lotto[i] = random.nextInt(45)+1;
        }

        System.out.println("로또 번호 : " + Arrays.toString(lotto));
        System.out.println("니가 입력한 번호 : " + Arrays.toString(userNumbers));

        int count = 0;
        for(int i=0; i< lotto.length; i++){
            for(int j=0; j<userNumbers.length; j++){
                if(lotto[i] == userNumbers[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count + "개 맞췄다!");
    }
}

