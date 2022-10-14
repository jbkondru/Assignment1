package learnJava;

public class Task7 {

	public static void main(String[] args) {
		// program to print * in right angle triangle shape with given base number *
		int n=6;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
