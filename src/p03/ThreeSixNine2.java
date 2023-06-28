package p03;

public class ThreeSixNine2 {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {
			String str = i + "";
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.print("짝, ");
			}else {
				System.out.print(str + ", ");
			}
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}

}
