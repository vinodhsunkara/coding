package arraysAndStrings;
import java.util.Scanner;

/**
 * Created by vinsun on 9/16/15.
 * Assuming it for ASCII - 256 characters
 * // ASCII characters list : http://www.theasciicode.com.ar/
 */

/* Method of hash tables */
public class UniqueCharacters {
		public boolean hasUniqueCharacters(String s) {
			if(s.length()>256) {
				return false;
			}
			int checker = 0;
			for(int i = 0; i<s.length(); i++) {
				int val = s.charAt(i) - 'a';
				if((checker & (1 << val)) > 0) {
					return false;
				}
				checker |= (1 << val);
			}
			return true;
		}
}
