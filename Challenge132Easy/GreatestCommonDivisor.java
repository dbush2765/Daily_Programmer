
import java.util.Scanner;

/* GreatestCommonDenominator.java */

/**
 * 
 * GreatestCommonDenominator will take any two numbers from the user, through the
 * console, and determine what their greatest common denominator is (the highest number
 * that both numbers can be divided from evenly). If there is no GCD, then 1 is
 * returned.
 * 
 * @author Dustyn Bush
 *
 */
public class GreatestCommonDivisor {
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		long firstNumber, secondNumber, largest, smallest;
		
		System.out.print("Enter your first number: ");
		firstNumber = keyboard.nextLong();
		System.out.print("Enter your second number: ");
		secondNumber = keyboard.nextLong();
		
		// Determine largest and smallest numbers
		largest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
		smallest = (largest == firstNumber) ? secondNumber : firstNumber;
		
		System.out.println("\nThe greatest common denominator is " + (firstNumber == secondNumber ? firstNumber : determineGCD(largest, smallest)));
	}

	private static long determineGCD(long largest, long smallest) {
		long remainder = 1;
		
		// Euclid's algorithm
		remainder = largest % smallest;
		if (remainder == 0) {
			return smallest;
		}
		
		return determineGCD(smallest, remainder);
	}
}
