package p02;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] strs = new String[10];
		
		for(int i=0; i<10; i++) {
			strs[i] = String.valueOf(10-i);
		}for(String str : strs) {
			System.out.println(str);
		}
	}

}
