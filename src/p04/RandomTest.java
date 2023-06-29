package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static String getRock(){
        Random random = new Random();
        int rNum = random.nextInt(3);
        if (rNum == 0){
            return "가위";
        }
        if (rNum == 1){
            return "바위";
        }
        if (rNum == 2){
            return "보";
        }
        return "";
    }

    public static void main(String[] args) {
        String rock = getRock();
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위, 바위 보! : ");
        String urRock = scanner.nextLine();

        if(rock.equals(urRock)) {
        	System.out.println("비김");
        }else if((rock.equals("가위") && urRock.equals("바위"))
        		||(rock.equals("바위") && urRock.equals("보"))
        		||(rock.equals("보") && urRock.equals("가위"))
        		) {
        			System.out.println("이감!");
        }else {
        	System.out.println("짐");
        }

    }
}
