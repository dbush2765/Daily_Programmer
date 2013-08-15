/* DivisibleDigits.java */

/**
 * DivisibleDigits takes two integers, N and M, and finds the largest integer of
 * N digits that is evenly divisible by M. N will always be greater than 1, and M
 * will always be greater than 2.
 *  
 * For example, if you are given an N of 3 and an M of 2, the largest 3-digit integer
 * that is evenly divisible by 2 is 998.
 *  
 * @author Dustyn Bush
 */

import java.util.Scanner;
import java.lang.Math;

public class DivisibleDigits {
	
	public static void main(String args []) {
		
		long n, m;
		Scanner keyboard = new Scanner(System.in);
		
		// Allow user to pick N and M values
		System.out.print("Enter a value for N: ");
		n = keyboard.nextLong();
		System.out.print("Enter a value for M: ");
		m = keyboard.nextLong();
		
		System.out.println("\nThe largest number with " + n + " digits that's divisible by " + m + " is " + getAnswer(n, m));
	}
	
	/**
	 * getAnswer takes N and M, finds the largest number possible with N digits, and
	 * then finds and returns the largest possible number divisible by M.
	 * 
	 * @param n How many digits the largest number will have.
	 * @param m What you want to divide the largest number by.
	 * @return Largest number with N digits divisible by M.
	 */
	private static long getAnswer(double n, long m) {
		long answer, largest;
		
		largest = (long) (Math.pow(10, n) - 1);
		answer = largest - largest % m;
		
		return answer;
	}
}
