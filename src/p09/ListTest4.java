package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 ,를 기준으로 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");

		for (int i = 0; i < numStrs.length; i++) {
			numList.add(Integer.parseInt(numStrs[i]));
		}

		System.out.println("숫자 3개를 ,를 기준으로 입력해주세요 : ");
		numStr = scan.nextLine();
		String[] numStrs2 = numStr.split(",");

		int cnt = 0;

		for (int i = 0; i < numList.size(); i++) {
			if (numList.contains(Integer.parseInt(numStrs2[i]))) {
				cnt++;
			}
		}
		System.out.println(cnt + "개 맞췄다!");
	}

}
