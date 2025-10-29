package ex;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number to get its Factorial value :");
		
		if (!scan.hasNextInt())
			System.out.println("Please select a valid amount.");
		else {
			int input = scan.nextInt();
			int fact = factorial(input);
			
			System.out.println("The factorial of " + input + " is : [" + fact + "].");
		}

		scan.close();
	}
	
	/// Return the product of a positive integer and all the ones under it.
	private static int factorial(int number) {
		if (number < 2)
			return 1; // Stop once the number is under 2.
		else
			return number * factorial(number - 1); // Multiply the current number by the one under.
	}
}
