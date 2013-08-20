
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
 * @author Dustyn Bush
 *
 */

public class McCarthy91 {
	
	public static void main(String args []) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		callMcCarthy(keyboard.nextInt());
		System.out.print("Done!");
	}
	
	private static int callMcCarthy(int n) {
		int oldN = n;	// Used to hold previous N value, for output purposes
		
		if (n > 100) {
			n -= 10;
			System.out.println(printStep(oldN, n));	// M(N) = N - 10
			return n;
		} else {
			n += 11;
			System.out.println(printStep(oldN, n));	// M(N) = M(N + 11)
			return callMcCarthy(callMcCarthy(n));
		}
	}
	
	private static String printStep(int oldN, int n) {
		return "M(" + n + ") since " + oldN + (oldN > 100 ? " is greater than 100" : " is equal to or less than 100");
	}
}