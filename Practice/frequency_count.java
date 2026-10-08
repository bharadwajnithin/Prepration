package Practice;

import java.util.HashMap;
import java.util.*;

public class frequency_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int arr[]= {1,2,3,5};

		int n=arr.length;
		
		HashMap<Integer,Integer>ma=new HashMap<>();
		for (int num:arr) {
			
			ma.put(num,ma.getOrDefault(num,0)+1);
			System.out.println(num);
		}
		
		
		System.out.println(ma);
		
	}

}
 