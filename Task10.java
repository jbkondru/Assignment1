package learnJava;

public class Task10 {

	public static void main(String[] args) {
		// program which will break the current execution if it find “Selenium”.
		String[] arr= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(String x: arr) {
			
			if(x == "Selenium") {
				continue;
			}
			System.out.println(x);
		}		

	}

}
