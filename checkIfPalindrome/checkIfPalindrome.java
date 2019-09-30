package checkIfPalindrome;

// Author: Jason W

import java.util.Scanner;

public class checkIfPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string to test whether it is a palindrome or not.");
		String str = scan.nextLine();
		// Ignore case, otherwise inputs such as "Racecar" will not work.
		str = str.toLowerCase();
		// This is needed in cases where the palindrome is multiple words.
		// Ex: Nurses run
		str = str.replaceAll("\\s+", "");
		// Check if the word is a palindrome and return the result.
		System.out.println(str + " is " + checkPalindrome(str));
	}
	
	// Recursively checks if a string is a palindrome.
	public static String checkPalindrome(String str) {
		// Base case: a single character is technically a palindrome.
		if(str.length() <= 1)
			return "a palindrome";
		else if(str.charAt(0) != str.charAt(str.length() - 1))
			return "not a palindrome";
		else
			return checkPalindrome(str.substring(1, str.length() - 1));
	}
}
