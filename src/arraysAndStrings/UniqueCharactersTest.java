package arraysAndStrings;

import java.util.Scanner;

/**
 * Created by vinsun on 9/17/15.
 */
public class UniqueCharactersTest {
	public static void main(String[] args) {
		char ch='n';
		String sample = null;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter the string you would like to test for unique characters");
			UniqueCharacters uq = new UniqueCharacters();
			sample = scan.next();
			boolean hasUniqueChars = uq.hasUniqueCharacters(sample);
			if(hasUniqueChars) {
				System.out.println("Yes the string "+sample+" has unique characters");
			} else {
				System.out.println("No the string "+sample+" doesnt have unique characters");
			}
			System.out.println("Press Y if you would like to continue");
			ch = scan.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
