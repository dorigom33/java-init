package p07;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.test();
		overloading.test("2");
		overloading.test((short)0);
		overloading.test((byte)0x1234);
		overloading.test(2);
		overloading.test(100000000000000L);
		overloading.test(2.2f);
		overloading.test(2.2222222222222);
		overloading.test('섭');
		overloading.test(true);
	}

}
