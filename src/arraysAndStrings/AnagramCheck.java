package arraysAndStrings;

/**
 * Created by vinsun on 9/29/15.
 */
public class AnagramCheck {
	public boolean checkAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		char[] sArray = s.toCharArray();
		for(char ch: sArray) {
			int index = t.indexOf(ch);
			if(index != -1) {
				t = t.substring(0, index) + t.substring(index+1,t.length());
			} else {
				return false;
			}
		}
		return t.isEmpty();
	}
}
