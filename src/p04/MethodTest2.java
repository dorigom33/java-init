package p04;

import java.util.Random;

public class MethodTest2 {
	public static int getRandomNum(int max) { 
		Random r = new Random();
		int rNum = r.nextInt(max);	//nexInt()의 데이터타입이 int라서 이게 된다
		rNum += 1;	//rNum이 int 니까 +1이 가능하다.
		return rNum;
	}
	public static void main(String[] args) {
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
	}

}
