package learnJava;

public class Task6 {

	public static void main(String[] args) {
		// program to print all prime numbers from 1-1000
		
		
		 for (int i=2;i<=1000;i++)
		 
		{
			if(i==2 ||i==3 || i==5 || i==7)
			{
				System.out.println(i);
			
			}else if (i%2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0)
			{
				
				System.out.println(i);
			}	
			
		}
       
		
		/*
		 * 
		 * 
		 
		// program to check if any given number is a prime number
		int n=71;
		
		    if(n==2 || n==3 || n==5 || n==7 )
		    {
		    	System.out.println(n +" is a prime number");
		    }else
			if (n!=1 && n%2 !=0 && n%3 !=0 && n%5 !=0 && n%7 !=0)
			{
				
				System.out.println(n +" is a prime number");
			} else
			{ 
				System.out.println(n +" is not a prime number");
			}
			
			*/
			
	}
			
		
	}


