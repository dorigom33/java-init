package p08;

public class Remocon implements Remote {

	@Override
	public void on() {
		System.out.println("킵니다.");
	}

	@Override
	public void off() {
		System.out.println("끕니다.");
	}
	
}

class TvRemocon extends Remocon{
	public void on() {
		System.out.println("TV를 킵니다.");
	}
	public void off() {
		System.out.println("TV를 끕니다.");
	}
	
	public void chUp() {
		System.out.println("채널을 올립니다.");
	}
	public void chDown() {
		System.out.println("채널을 내립니다.");
	}
}