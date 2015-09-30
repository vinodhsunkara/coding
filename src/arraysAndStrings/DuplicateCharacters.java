package arraysAndStrings;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by vinsun on 9/29/15.
 */
public class DuplicateCharacters {
	public boolean hasDuplicates(String str) {
		char[] strArray = str.toCharArray();
		int l = strArray.length;
		if(l < 2) {
			return false;
		}
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for(char ch: strArray) {
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			} else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap);
		Set<Character> charKeys = hmap.keySet();
		for(char ch: charKeys) {
			if(hmap.get(ch) > 1) {
				return false;
			}
		}
		return true;
	}
}
