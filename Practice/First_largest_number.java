package Practice;

public class First_largest_number {
	
	
	public static void main(String[]args) {
		int arr[]= {12,11,10,9,14};
		
		int first=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				first=arr[i];
				
				
			}
			
					
			
		}
		System.out.println("first largest number is "+first);
		

		
		
		
	}

}
