package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correct = false;	//false로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10)+1;	//1~10까지의 숫자
		
		while(!correct) {
			System.out.print("숫자를 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
			if(inputNum == rNum) {
				System.out.println("아 맞췄다!");
				correct = true;
			}
		}
	}

}
