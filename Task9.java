package learnJava;

public class Task9 {

	public static void main(String[] args) {
		// program which will break the current execution if it find number 85
		int arr[]= {12,34,66,85,900};
		
		for(int x: arr) {
			
			if(x == 85) {
				continue;
			}
			System.out.println(x);
		}		

	}

}
