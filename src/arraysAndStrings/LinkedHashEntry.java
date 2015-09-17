package arraysAndStrings;

/**
 * Created by vinsun on 9/16/15.
 * Hash Table Entry in linked list
 */
public class LinkedHashEntry {
	String key;
	int value;
    LinkedHashEntry next;
	/* Constructor */
	LinkedHashEntry(String key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}
