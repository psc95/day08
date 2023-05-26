package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass02 {
public static void main(String[] args) {
//	HashMap<String, String> map = new HashMap<>(); //값들이 랜덤으로 나온다
	LinkedHashMap<String, String> map = new LinkedHashMap<>(); // LinkedHashMap을 쓰면 값들이 순서대로 나옴
	map.put("선풍기", "100만원");
	map.put("에어컨", "10만원");
	map.put("자동차", "20만원");
	System.out.println( map );
	System.out.println("에어컨 가격 : "+map.get("에어컨") );
	System.out.println("======================================");
	
	System.out.println( map.keySet() ); //key값만 가져오는 명령어
	System.out.println( map.values() ); //value값만 가져오는 명령어
	System.out.println("==== 반복자 ====");
	Set<String> key = map.keySet();
	Iterator<String> it = key.iterator();
	
	while( it.hasNext() ) {
		String k = it.next();
		System.out.println( k + " : "+ map.get(k) );
	}
	
//	String k = it.next();
//	System.out.println( k+" : "+map.get(k));
//	k = it.next();
//	System.out.println( k+" : "+map.get(k) );
//	System.out.println( it.next() );
	
	
	
	
}
}
