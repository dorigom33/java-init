package p06;

public class Gugudan {
	public static void main(String[] args) {
		for(int f = 1; f < 10; f++) {
			for(int i = 1; i < 10; i++) {
				if(i == 9) {
					System.out.print(i + " X " + f + " = " + i*f);
					System.out.println();
				}else {
					System.out.print(i + " X " + f + " = " + i*f + ", ");
				}
			}
		}
	}

}