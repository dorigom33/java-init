package p02;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strs;	//변수의 선언
		String[] strs2 = new String[2];	//변수의 선언과 초기화
		System.out.println(strs2[0]);
		System.out.println(strs2[1]);
		strs2[0] = "1";
		strs2[1] = "2";
		
		
		String[] strNums = new String [10];
		for(int i = 0;i < 10; i++) {
			strNums[i] = String.valueOf(i+1);
		}
		for(String str : strNums) {
			System.out.println(str);
		}
	}

}
