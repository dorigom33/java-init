package p07;

public class FinalTest {
		//예약어는 사용할 수 없다.
		//main이외의 메서드에서 final을 쓸 경우 무조건 대문자로 쓴다.
		//이 부분에선 선언만 가능하다.
		final int NUM_TEST = 1;	//상수는 대문자로, 단어 사이는 언더바로 구분한다.
	public static void main(String[] args) {
		final int num = 1;
		//num = 2; -> 이건 오류난다.
	}

}
