package p05;

public class FoodExec {
    public static void printFood(Food[] foods) {
    	
    	for(Food f : foods) {
        System.out.println("음식 이름 : " + f.name);
        System.out.println("가격 : " + f.price);
        System.out.println("타입 : " + f.type);
    	}
    }

    public static void main(String[] args) {
        Food f = new Food();
        f.name = "삼겹살";
        f.price = 15000;
        f.type = "한식";
        
        Food f1 = new Food();
        f1.name = "치킨";
        f1.price = 20000;
        f1.type = "한식";
        
        Food f2 = new Food();
        f2.name = "햄버거";
        f2.price = 9000;
        f2.type = "양식";
        
        Food f3 = new Food();
        f3.name = "볶음밥";
        f3.price = 8500;
        f3.type = "중식";
        
        Food f4 = new Food();
        f4.name = "선지해장국";
        f4.price = 8700;
        f4.type = "한식";
        
        Food[] foods = new Food[5];
        foods[0] = f;
        foods[1] = f1;
        foods[2] = f2;
        foods[3] = f3;
        foods[4] = f4;
        
        printFood(foods);

        
    }

}