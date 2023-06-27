package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int[]arr = new int [3];
		/*
		arr[0] = r.nextInt(10)+1;		//인트타입
		arr[1] = r.nextInt(10)+1;		//인트타입
		arr[2] = r.nextInt(10)+1;		//인트타입
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		for(int i=0; i<3; i++) {
			arr[i] = r.nextInt(10)+1;
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
