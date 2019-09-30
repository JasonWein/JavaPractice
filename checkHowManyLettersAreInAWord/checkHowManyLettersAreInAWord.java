package test329423;

import java.util.Scanner;

// Write a recursive method that
// finds the number of occurrences of a specified letter in a string 

public class checkHowManyLettersAreInAWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Word to check.
		System.out.println("Please enter an word");
		String string = scan.nextLine();
		// Character to count
		System.out.println("Please enter a character");
		char character = scan.nextLine().charAt(0);
		System.out.println("There are " + count(string, character) + " " + character + " characters in the word.");
	}
	// Recursive method that checks each index of a string
	// for the given character.
	public static int count(String str, char a) {
		if(str.length() == 0)
			return 0;
		int count = 0;
		if(str.charAt(0) == a)
			count++;
		return count + count(str.substring(1), a);
	}
	
}
