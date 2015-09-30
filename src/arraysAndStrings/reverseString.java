package arraysAndStrings;
import java.util.Arrays;

/**
 * Created by vinsun on 9/29/15.
 */
public class ReverseString {
	public char[] reverseString(String Str) {
		char[] strArray = Str.toCharArray();
		int l = strArray.length, i=0, j=l-1;
		char temp;
		while(i<j) {
			temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = temp;
			i++;
			j--;
		}
		return strArray;
	}
}
