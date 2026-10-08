package Practice;

public class Second_laargest_number {
	public static void main(String[]args) {
		int arr[]= {12,11,10,9,14,49,50,48};
		
		int first=0;
		int second=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];			
				
			}
			
					
			
		}
		System.out.println("second   "+second);
		

		
		
		
	}

}
