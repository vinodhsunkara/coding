package arraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vinsun on 9/29/15.
 */
public class AnagramTest {
	public static void main(String[] args) {
		AnagramCheck anagram = new AnagramCheck();
		try {
			System.out.println("Enter the first string:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			System.out.println("Enter the second string:");
			String t = br.readLine();
			boolean areAnagrams = anagram.checkAnagram(s, t);
			if(areAnagrams) {
				System.out.println("Both strings are anagrams");
			} else {
				System.out.println("Strings are not anagrams");
			}
		}
		catch(IOException ex) {
			System.out.println("There is an i/o exception in reading strings");
		}
	}
}
