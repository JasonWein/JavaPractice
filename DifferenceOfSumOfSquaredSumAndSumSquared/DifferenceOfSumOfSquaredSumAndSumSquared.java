package test329423;
import java.lang.Math;
class DifferenceOfSumOfSquaredSumAndSumSquared {
	public static void main(String args[]) {
		int sum = 0;
		/* Load your calculation into the `sum` variable. */
		/* Your code below this line */
		int sumOfSquares = 0;
		for(int i = 1; i <= 10; i++){
		  sumOfSquares += Math.pow(i,2);
		}
		int sum2 = 0;
		for(int i = 1; i <= 10; i++){
		  sum2 += i;
		}
		int squareSum = (int) Math.pow(sum2, 2);
		
		sum = squareSum - sumOfSquares;
		/* Your code above this line */
		
		System.out.println(sum);
	}
}