package p02;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int [6];
			for(int i=0; i<lotto.length; i++) {
				double db = r.nextDouble();
				db *= 45;
				db += 1;
				int rNum = (int)db;
				lotto[i] = rNum;
			}
			for(int i = 0; i<lotto.length; i++) {
				System.out.println("lotto[" + i + "] = " + lotto[i]);
			}

	}

}
