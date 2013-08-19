
import java.util.Scanner;

/* McCarthy91.java */

/**
 * 
 * The McCarthy 91 Function is a recursive function which, given 
 * an integer N, returns the integer 91 if N is equal to or smaller 
 * than 100, or simply N-10 if N is greater than 100.
 * 
 * This program will calculate the McCarthy function, and the output
 * will show each step taken to get to 91. The input N can be any number
 * from 0 to 2 billion.
 * 
 * @author dustynbush
 *
 */

public class McCarthy91 {
	
	public static void main(String args []) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a number: ");
		n = keyboard.nextInt();
		
		answer(n);
	}
	
	/**
	 * answer will take the number given by the user, and print out
	 * the McCarthy Function steps needed to get to the final answer.
	 * @param n Number given by the user.
	 */
	private static void answer(int n) {
		System.out.println("M(" + n + ")");
		n = callMcCarthy(n);
		System.out.println(n);
	}
	
	/**
	 * For any given N, the return will be 91 if N is less than or
	 * equal to 100, and N - 10 if N is greater than 100. This method
	 * will take integer N and run it through the McCarthy function.
	 * 
	 * Will recursively call itself if N is less than 100, using
	 * N + 11 as it's new parameter.
	 * @param n Number given by the user.
	 * @return Either N - 10, or recursively calling itself for M(N+11)
	 */
	private static int callMcCarthy(int n) {
		int oldN = n;	// Used to hold previous N value, for output purposes
		
		if (n > 100) {
			n -= 10;
			System.out.println(printOutput(oldN, n));
			return n;
		} else {
			n += 11;
			System.out.println(printOutput(oldN, n));
			return callMcCarthy(callMcCarthy(n));
		}
	}
	
	/**
	 * Prints each step of the McCarthy function. Will tell the user
	 * what step is taken, and why it arrived there.
	 * @param oldN N value from the previous step.
	 * @param n Current step's N value.
	 * @return String explaining the current step being taken.
	 */
	private static String printOutput(int oldN, int n) {
		return "M(" + n + ") since " + oldN + lessOrGreaterThan(oldN);
	}
	
	/**
	 * Takes the old value of N and determines whether it's greater or
	 * less than 100, so that it can tell the user why each step was
	 * taken.
	 * @param n Value of N from the previous step.
	 * @return String telling the user if the previous N value was greater
	 * than or less than 100.
	 */
	private static String lessOrGreaterThan(int n) {
		return (n > 100) ? " is greater than 100" : " is equal to or less than 100";
	}
}
