package test329423;

// Author: Jason W

import java.lang.Math;
class DifferenceOfSumOfSquaredSumAndSumSquared {
	public static void main(String args[]) {
		int sum = 0;
		/* Load your calculation into the `sum` variable. */
		/* Your code below this line */
		int sumOfSquares = 0;
		// For each natural number, from 1 to 100,
		// Find the sum of each integer squared.
		// Ex: (1^2 + 2^2 + 3^2 + ... + 100^2).
		for(int i = 1; i <= 100; i++){
		  sumOfSquares += Math.pow(i,2);
		}
		int sum2 = 0;
		// For each natural number, 1 to 100,
		// Find the sum of each integer and square it.
		// Ex: (1 + 2 + 3 + ... + 100) ^2.
		for(int i = 1; i <= 100; i++){
		  sum2 += i;
		}
		int squareSum = (int) Math.pow(sum2, 2);
		// Find the difference of the two values.
		sum = squareSum - sumOfSquares;
		/* Your code above this line */
		
		System.out.println(sum);
	}
}