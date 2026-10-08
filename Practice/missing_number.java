package Practice;

public class missing_number {
	public static void main(String []args) {
		
		int n=5;
		int arr[]= {1,2,3,5};
		int sum=0;
		
		
		
		for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
			 
			
		}
		int total=n*(n+1)/2;
		System.out.println();
		int missing=total-sum;
		System.out.println("the missing b=no is "+missing);
		
	}

}
