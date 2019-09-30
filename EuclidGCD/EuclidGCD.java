import java.util.Scanner;
// Finding the GCD using Euclid's algorithm {O(logn)}.
// Sept. 9, 2019
// Jason W
public class EuclidGCD {
	// Calculates the GCD for values m and n.
	public static int euclidGCD(int m, int n) {
		int gcd;
		if (m % n == 0)
			gcd = n;
		else {
			return euclidGCD(n, m% n);
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Get the two numbers as user input.
		System.out.println("Please enter the first number");
		int m = scan.nextInt();
		System.out.println("Please enter the second number");
		int n = scan.nextInt();
		System.out.println("The greatest common divisor for " + m + " and " + n + " is " + euclidGCD(m,n));
	}

}
