package p08;

public class Aircon implements Remote {
	@Override
	public void on() {
		System.out.println("킵니다.");
	}
	
	@Override
	public void off() {
		System.out.println("끕니다.");
	}

}

class AirconRemocon extends Remocon{
	public void on() {
		System.out.println("에어컨을 킵니다.");
	}
	public void off() {
		System.out.println("에어컨을 끕니다.");
	}
	public void tempUp() {
		System.out.println("온도를 올립니다.");
	}
	public void tempDown() {
		System.out.println("온도를 내립니다.");
	}
}