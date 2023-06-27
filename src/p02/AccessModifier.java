package p02;

public class AccessModifier {
		int b = 10;
	public static void main(String[] args) {
			int i = 1;
			System.out.println(i);
			
			AccessModifier am = new AccessModifier();
			System.out.println(am.b);
			
			AccessModifier am1 = new AccessModifier();
			System.out.println(am1.b);
	}
	
}
