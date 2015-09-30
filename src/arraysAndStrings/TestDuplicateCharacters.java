package arraysAndStrings;

import java.util.Scanner;

/**
 * Created by vinsun on 9/29/15.
 */
public class TestDuplicateCharacters {
	public static void main(String[] args) {
		DuplicateCharacters dupc = new DuplicateCharacters();
		Scanner sc = new Scanner(System.in);
		boolean hasDup = dupc.hasDuplicates(sc.next());
		if(hasDup) {
			System.out.println("Given string has duplicate characters");
		} else {
			System.out.println("Given string doesnt not have duplicate characters");
		}
	}
}
