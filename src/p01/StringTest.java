package p01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234567890";
		char c = str.charAt(5);
		System.out.println(c);
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2);
		String s3 = new String("1");
		System.out.println(s1 == s3);
		String s4 = new String("1");
		System.out.println(s3 == s4);
		//s1과 s2는 메모리 주소가 같지만 s3은 메모리 주소가 다르다.
		//s3과 s4는 같은 주소지만 새로 1을 만들어서 false가 나옴.
		
		System.out.print(s3.equals(s4));	//equals => 소문자, 괄호있음 == 메서드이다. 그리고 값을 비교하기 때문에 true가 나옴.
		
		int idx = str.indexOf("3");
		System.out.println(idx);
		int idx2 = str.indexOf("6");
		System.out.println(idx2);
		String str2 = str.substring(idx);
		System.out.println(str2);
		str2 = str.substring(idx,idx2);
		System.out.println(str2);
		str = str.replace("1", "one");
		System.out.println(str);
		
		String name = "lee";
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		
	}

}
