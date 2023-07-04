package p07;

class Song {
	public int rank;
	public String title;
	
	public void printTitle() {
		System.out.println("노래 제목 : " + title);
	}	
}

public class SonExec {
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "동동";
		s.job = "개발자";
		s.age = 30;
		s.hobby = "게임";
	
		Father f = new Son();
		f.name = "같은거임";
		// f.hobby = "투자"; => 오류남
		Son s2 = (Son)f;	//f를 Son으로 캐스팅. s2는 hobby를 사용할 수 있다.
		s2.hobby = "투자";
		System.out.println(s2.name);
		
		Song song = new Song();
		// song.name = "하입보이"; => 오류남
		song.title = "Rage of Dust";
		song.printTitle();
		
		s.printJob();
		s.printHobby();
		f.name = "동동이";
		/*
		Son s3 = (Son)f;
		s3.hobby = "낚시";		=>캐스팅 에러가 발생한다.
		*/
		
	}

}
