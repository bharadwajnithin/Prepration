 package Practice;
import java.util.*;

import com.sun.jdi.CharType;

public class Anagrams {
	

	
	
	
	public static boolean anagram(String s1,String  s2) {
	
	
	
	
	HashMap<Character,Integer>map=new HashMap<>();
	
	for (char ch:s1.toCharArray()){
		if(map.containsKey(ch)) {
		
			map.put(ch,map.getOrDefault(ch, 0)+1);
			
		}else {
			map.put(ch,1);
		}

		
	}
	
	for (char ch:s2.toCharArray()){
		if(map.containsKey(ch)) {
		
			map.put(ch,map.getOrDefault(ch, 0)-1);
			
		}else {
			map.put(ch,1);
		}

		
	}
	for(int i=0; i<s1.length(); i++) {
		
		char ch = s1.charAt(i);
		int count = map.getOrDefault(ch,0);
		
		if(count != 0) {
			return false;
		}
		
	}
	return true;
}
	
	
	
	

	public static void main(String[] args) {	
		
		String n ="nithin";
		String m="Durgesh";
		
		System.out.println(anagram(n, m));
		
		
	}

}
