package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Random r = new Random();
		boolean correct = false;
		int rNum = r.nextInt(50)+1;

		
		Scanner scan = new Scanner(System.in);
		
		while(!correct) {
			System.out.print("1-50까지의 숫자 입력 : ");
		
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(correct = rNum == num) {
			System.out.println("맞춤");
		}if(rNum>num) {
			System.out.println("UP");
		}if(rNum<num) {
			System.out.println("DOWN");
			
			}
	
		}
	}
	

}
