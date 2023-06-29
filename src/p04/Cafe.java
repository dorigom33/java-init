package p04;

public class Cafe {

    public static String getCoffee(String order, int price) {
    	int coffeePrice = 500;
    	int charge = price-coffeePrice;
    	if(coffeePrice>price) {
    		return (coffeePrice-price) + "원이 부족합니다.";
    	}
    	if(coffeePrice<price) {
    		return "주문하신 " + coffeePrice + "원 짜리 " + order + "가 준비되었습니다. " + "잔돈 " + charge + "원 입니다.";
    		
    	}
        return "주문하신 " + coffeePrice + "원 짜리 " + order + "가 준비되었습니다.";
    }

    public static void main(String[] args) {
        String coffee = getCoffee("아아", 2000);
        System.out.println(coffee);
    }
}
