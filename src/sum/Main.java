package sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter four numbers:");
		int firstInt = reader.nextInt();
		int secondInt = reader.nextInt();
		int thirtInt = reader.nextInt();
		int fourthInt = reader.nextInt();
		System.out.print("The sum of all this numbers is:");
		System.out.print(firstInt+secondInt+thirtInt+fourthInt);
			  
	}

}
