package ex;

import java.util.Scanner;

public class Factorial {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Type a number to get its Factorial value :");
		if (!scan.hasNextInt())
			System.out.println("Please select a valid amount.");
		
		int input = scan.nextInt();
		int fact = factorial(input);
		
		System.out.println("The factorial of " + input + " is : [" + fact + "].");
	}
	
	/// Return the product of a positive integer and all the ones under it.
	private static int factorial(int number) {
		if (number < 2)
			return 1; // Stop once the number is under 2.
		else
			return number * factorial(number - 1); // Multiply the current number by the one under.
	}
}
