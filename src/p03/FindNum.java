package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correct = false;	//false로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10)+1;	//1~10까지의 숫자
		int count = 0;
		
		while(!correct) {
			System.out.print("숫자를 입력하세요 : ");
			count = count + 1;
			int inputNum = Integer.parseInt(scan.nextLine());
			if(inputNum == rNum) {
				correct = true;
			}
		}
		System.out.println("아!" + count + "번 만에 맞췄다! 정답은 " + rNum + "(이)다!");
	}

}
