package p06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int[] nums = new int[3];
		Random random = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(10);
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		nums = new int[] {5,0,1};
		Scanner scan = new Scanner(System.in);
		System.out.print("니가 생각하는 숫자를 ,를 기준으로 3개만 말해봐:");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int[] compNums = new int[numStrs.length];
		int strike=0;
		int ball=0;
		
		
		for(int i=0;i<numStrs.length;i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
		}

		while(strike == 3) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<compNums.length; j++) {
				if(i==j) {
					strike++;
				}else {
					ball++;
				}
				break;
			}
		}
		System.out.println("스트라이크 : " + strike);
		System.out.println("볼 : " + ball);
		
		
		}

		
	}
}
