package arraysAndStrings;

/**
 * Created by vinsun on 9/16/15.
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Creative Crackers");
		System.out.println("Capacity :" + str.capacity());
		//void ensureCapacity(int initialCapacity)
		//The new capacity of the StringBuffer is the maximum of,
		//1) The initialCapacity argument passed and
		//2) ( Old capacity * 2 ) + 2

		//Java string concatenation implemented using String Buffer: String str = “Hello” + “World”;
		//String str = new StringBuffer().append(“Hello”).append(“World”).toString();
	}
}
