
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

	private static long firstNumber, secondNumber;
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user for your two numbers
		System.out.print("Enter your first number: ");
		firstNumber = keyboard.nextLong();
		System.out.print("Enter your second number: ");
		secondNumber = keyboard.nextLong();
		
		System.out.println("\nThe greatest common denominator is " + getAnswer());
	}
	
	/**
	 * Takes the numbers entered by the user and feeds back the greatest common
	 * denominator.
	 * @return Greatest common denominator.
	 */
	private static long getAnswer() {
		long largest, smallest;
		
		/* 
		 * First determine that both numbers aren't equal, return the given
		 * number if they are.
		 */
		if (firstNumber == secondNumber) {
			return firstNumber;
		}
		
		// Determine which of the two numbers is the largest and smallest
		largest = determineLargest();
		smallest = determineSmallest();
		
		return determineGCD(largest, smallest);
	}
	
	/**
	 * Takes both numbers and determines which of the two is larger.
	 * @return The largest of the two numbers.
	 */
	private static long determineLargest() {
		return (firstNumber > secondNumber) ? firstNumber : secondNumber;
	}
	
	/**
	 * Takes both numbers and determines which of the two is the smallest.
	 * @return The smallest of the two numbers.
	 */
	private static long determineSmallest() {
		return (firstNumber < secondNumber) ? firstNumber : secondNumber;
	}
	
	/**
	 * Uses Euclid's algorithm to determine the greatest common denominator. Takes
	 * in two parameters, largest and smallest.
	 * @param largest The largest of the two numbers.
	 * @param smallest The smallest of the two numbers.
	 * @return The greatest common denominator
	 */
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
