package arraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by vinsun on 9/29/15.
 */
public class TestReverseString {
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string you would like to reverse");
		try {
			String inputString = br.readLine();
			char[] outputString = rs.reverseString(inputString);
			System.out.println("The reversed string is: ");
			System.out.println(outputString);
		}
		catch(IOException ex) {
			System.out.println("There is an i/o exception in reading the string");
		}
	}
}
