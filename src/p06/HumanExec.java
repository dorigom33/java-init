package p06;

public class HumanExec {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "이상수";
		h1.age = 26;
		
		Human h2 = new Human();
		h2.name = "이정수";
		h2.age = 23;
		
		Human h3 = new Human();
		h3.name = "심원섭";
		h3.age = 46;
		
		Human h4 = new Human();
		h4.name = "김태준";
		h4.age = 40;
		
		Human h5 = new Human();
		h5.name = "김영우";
		h5.age = 25;
		
		Human[] humans = new Human[5];
		
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		
		
		Human yHuman = humans[0];
		Human oHuman = humans[0];
		
		for(int i=0; i<humans.length; i++) {
			
			System.out.println(humans[i].name + ", " + humans[i].age);
			
			if(oHuman.age < humans[i].age) {
				oHuman = humans[i];
			}
			if(yHuman.age > humans[i].age) {
				yHuman = humans[i];
			}
		}
		
		int sum = 0;
		int avg = 0;
		for(int i=0; i<humans.length; i++) {
			sum += humans[i].age;
			avg = sum/humans.length;
		}
		
		
		int ans = 0;
		for(int i=0; i<humans.length; i++) {
			int abs = Math.abs(avg - humans[i].age);
			if(abs < humans[i].age) {
				abs = humans[i].age;
				ans = abs;
			}

		}
		
		System.out.println("최고령 : " + oHuman.name + " 나이 : " + oHuman.age);
		System.out.println("최연소 : " + yHuman.name + " 나이 : " + yHuman.age);
		System.out.println("평균 : " + avg);
		
		for(int i=0;i<humans.length; i++) {
			if(humans[i].age == ans) {
				System.out.println("평균과 가장 가까운 나이의 사람 : " + humans[i].name + " 그 나이는 : " + ans);
			}
		}
		
		
		
	}

}
