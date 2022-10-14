package learnJava;

public class Task8 {

	public static void main(String[] args) {
		// program to print below students marks who have scored above 75
		int arr[]= {78,12,89,55,35};
		
		for(int x: arr) {
			
			if(x > 75) {
				System.out.print(x+",");
			}
			
		}		

	}

}
