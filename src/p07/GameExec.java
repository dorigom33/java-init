package p07;

public class GameExec extends Game{
	
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	public static void main(String[] args) {
		LegendOfZelda zelda = new LegendOfZelda();
		zelda.name = "젤다의 전설 왕국의 눈물";
		GuiltyGearStrive ggst = new GuiltyGearStrive();
		ggst.name = "길티기어 스트라이브";
		runGame(zelda);
		runGame(ggst);
		
		
		/*
		Game tearsOfKingdom = new LegendOfZelda();
		tearsOfKingdom.name = "젤다의 전설 왕국의 눈물";
		tearsOfKingdom.price = 69000;
		tearsOfKingdom.genre = "오픈에어";
		
		Game ggstrive = new GuiltyGearStrive();
		ggstrive.name = "길티기어 스트라이브";
		ggstrive.price = 39000;
		ggstrive.genre = "2d격투게임";
		
		Game[] games = new Game[2];
		games[0] = tearsOfKingdom;
		games[1] = ggstrive;
		
		for(int i=0; i<games.length; i++) {
			System.out.println(games[i].name);
			if(games[i] instanceof LegendOfZelda) {
				LegendOfZelda lz = (LegendOfZelda)games[i];
				lz.heroName = "링크";
				lz.weapon = "마스터소드";
				lz.skill = "대회전베기";
				System.out.println("주인공 : " + lz.heroName + " 무기 : " + lz.weapon + " 기술 : " + lz.skill);
			}else if(games[i] instanceof GuiltyGearStrive) {
				GuiltyGearStrive gg = (GuiltyGearStrive)games[i];
				gg.heroName = "솔 배드가이";
				gg.weapon = "아웃레이지 Mk.2";
				gg.skill = "볼카닉 바이퍼";
				System.out.println("주인공 : " + gg.heroName + " 무기 : " + gg.weapon + " 기술 : " + gg.skill);
			}else {
				System.out.println();
			}
		}
		*/
		
	}
	
	

}
