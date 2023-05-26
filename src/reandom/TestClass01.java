package reandom;

import java.util.Random;

public class TestClass01 {
public static void main(String[] args) {
//	0.0 ~ 0.99 사이의 수를 뽑아준다
	for(int i=0; i<5; i++) {
		double ran = Math.random();
		// 0.00 ~ 0.99
		// * 3
		// 0.00 ~ 2.9999
		// int형변환 => 0 ~ 2 총 3개의 값을 가져온다
		System.out.println( ran*3 + ", "+ (int)(ran*3) );
	}
	System.out.println("------------------------------------------");
	for(int i=0; i<5; i++) {
		// 0.000 ~ 0.9999
		// * 10
		// 0.000 ~ 9.9999
		// + 10
		// 10.0000 ~ 19.9999 => int->10~19
		int n = (int)(Math.random()*10 + 10);
		System.out.println( n );
	}
	System.out.println("---------------------------------------------");
	for(int i=0; i < 5; i++) {
		System.out.println( (int)(Math.random()*4 + 10) );
	}
	System.out.println("=================================================s");
	Random rand = new Random();
	for(int i =0; i < 5; i++) {		// 0 ~ 4
		System.out.println( rand.nextInt(5) );
	}
	
	
	
	
	
	
	
}
}
