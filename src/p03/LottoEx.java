package p03;

import java.util.Random;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
			Random r = new Random();
			int[] lotto = new int[6];
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = r.nextInt(45)+1;
				System.out.println(lotto[i]);
			}
			Scanner scan = new Scanner(System.in);
			System.out.print("1~45까지의 숫자를 6개 입력해라 : ");
			String num = scan.nextLine();
			String[] strs = num.split(",");
			int cnt = 0;
			for(int i=0; i<strs.length; i++) {
				for(int j=0; j<lotto.length; j++) {
					if(lotto[i] == Integer.parseInt(strs[i])) {
						cnt++;
					}
				}
			}
			System.out.println(cnt + "개 맞췄다!");
	}

}
