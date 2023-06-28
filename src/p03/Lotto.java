package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random();
		for(int i = 0; i < lotto.length; i++) {		
				int rNum = random.nextInt(45) + 1;
				lotto[i] = rNum;
				for(int j = 0; j < i; j++) {
					if(lotto[j] == rNum) {
						i--;
						break;		//break를 포함하는 for문만 빠져나옴.
					}
				}
				if(lotto[i]==0) {
					lotto[i] = rNum;	
				}
				

		}for(int i = 0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}

	}

}