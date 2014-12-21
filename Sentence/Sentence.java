//you enter a sentence and get all letters 

package test.test1;

import java.util.*;

public class Sentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Function nextLine () reads a line to the end:
		String sentece = scanner.nextLine();
		// Create a set of dividers:
		Set<Character> delimeters = new HashSet<Character> (
		Arrays.asList(' ', '.',', ', ':', ';', '?', '!', '-', '(', ')');
		// Create a set of letters:
		Set<Character> letters = new TreeSet<Character>();
		// Add all the characters except delimiters:
		for (int i = 0; i < sentece.length(); i++) {
			if (!delimeters.contains (sentece.charAt(i)))}
			System.out.println(letters):
		}
	}
	