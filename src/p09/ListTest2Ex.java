package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2Ex {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		while (numList.size() < 20) {
			int rNum = r.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}

		for (int i = 0; i < numList.size(); i++) {
			String strNum = Integer.toString(numList.get(i));
			if (strNum.contains("3") || strNum.contains("6") || strNum.contains("9")) {
				System.out.println(strNum + " : 짝");
			}else {
				System.out.println(strNum);
			}

		}
	}

}
