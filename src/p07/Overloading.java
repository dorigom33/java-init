package p07;

public class Overloading {
	public void test() {
		System.out.println("test() 호출");
	}
	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	public void test(byte bytes) {
		System.out.println("test(byte bytes) 호출");
	}
	public void test(short shorts) {
		System.out.println("test(short shorts) 호출");
	}
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	public void test(long longs) {
		System.out.println("test(long longs) 호출");
	}
	public void test(float floats) {
		System.out.println("test(float floats) 호출");
	}
	public void test(double db) {
		System.out.println("test(double db) 호출");
	}
	public void test(char chars) {
		System.out.println("test(char chars) 호출");
	}
	public void test(boolean bools) {
		System.out.println("test(boolean bools) 호출");
	}
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		o1.test();
		o1.test("2");
		
		o1.test((short)0);
		o1.test((byte)0x1234);
		o1.test(2);
		o1.test(100000000000000L);
		
		o1.test(2.2f);
		o1.test(2.2222222222222);
		
		o1.test('섭');
		
		o1.test(true);
	}

}

/*!오버로딩의 기준!
 * =>같은 영역이어야 한다
 * =>메서드명이 같아야 한다
 * =>파라미터 개수가 달라야 한다.
 * =>파라미터의 개수가 같더라도 데이터 타입이 달라야 한다.
 * =>파라미터의 개수와 데이터타입이 같더라도 순서가 달라야 한다.
 * */
