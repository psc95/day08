package reandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class 로또번호뽑기 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
//	while(arr.size()<6){
//		int ran = (int)(Math.random()*6)+1;
//		if(arr.contains(ran+"")==false)	
//			arr.add(ran+"");
//	}
//	System.out.println( arr );

	Random rand = new Random();
	HashSet<String> hs = new HashSet<>();
	int num;
	while(hs.size()<6){
		num = rand.nextInt(45)+1;
		hs.add(num+"");  
	}
	System.out.println( hs );
	
//	HashMap<String, String> map = new HashMap<>();
//	while(map.size()<6){
//		num = rand.nextInt(6)+1;
//		map.put(num+"", num+"");  
//	}
//	System.out.println(map);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
