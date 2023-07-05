package p08;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		
		ArrayList<Float> flsList = new ArrayList<Float>();
		flsList.add(1.1F);
		flsList.add(22.1F);
		flsList.add(1.2222F);
		
		ArrayList<Character> charList = new ArrayList<Character>();
		charList.add('a');
		charList.add('b');
		charList.add('c');
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("우리");
		strList.add("모두");
		strList.add("화이팅!");
		
		
		for(int i=0; i<flsList.size(); i++) {
			System.out.println(flsList.get(i));
		}
		for(int i=0; i<charList.size(); i++) {
			System.out.println(charList.get(i));
		}
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
