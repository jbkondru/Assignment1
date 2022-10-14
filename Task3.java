package learnJava;

public class Task3 {
	static double d=0.00d;
	public static void main(String[] args) {
		// program to print the average of below 5 numbers.
		
		double arr[]= {10,90.78,111,8989,7876};
		System.out.println("Number to be added are");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
			d = d+arr[i];
		}

	System.out.println("sum of above 5 numbers is "+d);
	
	System.out.println("Avg of above 5 numbers is "+(d/arr.length));
	
  
	
	
	
	

	}

}
