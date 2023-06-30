package p05;

public class HumanExec {
	
	public static void printHuman(Human[] humans) {
		for(Human h : humans) {
			System.out.println("이름 : " + h.name);
			System.out.println("돈 : " + h.money);
			System.out.println("--------------");
			System.out.println("합계는 : ");
			
		}
		
	}

	public static void main(String[] args) {
		
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "이상수";
		humans[0].money = 250000;
		
		humans[1] = new Human();
		humans[1].name = "김영우";
		humans[1].money = 121687;
		
		humans[2] = new Human();
		humans[2].name = "심원섭";
		humans[2].money = -3000;
		
		humans[3] = new Human();
		humans[3].name = "이정현";
		humans[3].money = 100000;
		
		humans[4] = new Human();
		humans[4].name = "서동근";
		humans[4].money = 600000;
		
		
		int sum = 0;
		int avg = 0;
		for(int i=0;i<humans.length; i++) {
			sum += humans[i].money;
			
			
		}
		avg = sum/humans.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		for(int j=0;j<humans.length; j++) {
			if(humans[j].money >= avg) {
				System.out.println(humans[j].name);
			}
		}
		

	}

}
