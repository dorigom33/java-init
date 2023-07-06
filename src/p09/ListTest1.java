package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random random = new Random();

		while(numList.size() < 6) {
			int rNum = random.nextInt(100)+1;
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
				}
			}
		System.out.println(numList);
		
		int min = numList.get(0);
		int max = numList.get(0);
		for(int i=1; i<numList.size(); i++) {
			if(max < numList.get(i)) {
				max = numList.get(i);
				}
			if(min > numList.get(i)) {
				min = numList.get(i);
				}
	
			}
	
		System.out.println(max);
		System.out.println(min);
	}
}
