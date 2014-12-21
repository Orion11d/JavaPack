//you enter a sentence and get all letters 

package test.test1;

import java.util.*;

public class Sentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentece = scanner.nextLine();
		Set<Character> delimeters = new HashSet<Character> (
		Arrays.asList(' ', '.',', ', ':', ';', '?', '!', '-', '(', ')');
		Set<Character> letters = new TreeSet<Character>();
		for (int i = 0; i < sentece.length(); i++) {
			if (!delimeters.contains (sentece.charAt(i)))}
			System.out.println(letters):
		}
	}
	