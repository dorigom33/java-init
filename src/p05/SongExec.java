package p05;

public class SongExec {
	public static void printSong(Song[] songs) {
		for(Song s : songs) {
			System.out.println("제목 : " + s.name);
			System.out.println("가수 : " + s.singer);
			System.out.println("순위 : " + s.rank);
			System.out.println("----------------------");
		}
	}
	
	public static void main(String[] args) {
		
		Song[] songs = new Song[5];
		
		songs[0] = new Song();
		songs[0].name = "마지막인사";
		songs[0].singer = "빅뱅";
		songs[0].rank = 1;
		
		songs[1] = new Song();
		songs[1].name = "가시";
		songs[1].singer = "버즈";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "완전감각 Dreamer";
		songs[2].singer = "One Ok Rock";
		songs[2].rank = 3;
		
		songs[3] = new Song();
		songs[3].name = "그땐그땐그땐";
		songs[3].singer = "슈프림팀";
		songs[3].rank = 4;
		
		songs[4] = new Song();
		songs[4].name = "뜨래요";
		songs[4].singer = "배치기";
		songs[4].rank = 5;
		
		printSong(songs);
		
		
		Song fsong = songs[0];
		Song lsong = songs[0];
		
		for(int i=1;i<songs.length;i++) {
			if(fsong.rank > songs[i].rank) {
				fsong = songs[i];
			}
			if(lsong.rank < songs[i].rank) {
				lsong = songs[i];
			}
		}
		
		System.out.println("일등 : " + fsong.singer + " 의 " + fsong.name);
		System.out.println("일등 : " + lsong.singer + " 의 " + lsong.name);
		
		int max = songs[0].rank;
		int min = songs[0].rank;
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=1; i<songs.length; i++) {
			if(max<songs[i].rank) {
				max = songs[i].rank;
				cnt1=i;
			}
			if(min>songs[i].rank) {
				min = songs[i].rank;
				cnt2=i;
			}
		}
		
		System.out.println("1등 : " + songs[cnt2].name + ", 가수 : " + songs[cnt2].singer);
		System.out.println("꼴등 : " + songs[cnt1].name + ", 가수 : " + songs[cnt1].singer);

	}

}
