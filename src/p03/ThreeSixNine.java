package p03;

public class ThreeSixNine {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int num = i%10;
			int num2 = i/10;
			if((num!=0 && num%3==0||num2%3==0)||(num2!=0&&num2%3==0)) {
				System.out.print("짝, ");
			}else {
				System.out.print(i+"["+num+"], ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}

	}
}