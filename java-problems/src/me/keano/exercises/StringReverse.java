package me.keano.exercises;

/**
 * Reverse a string
 * @author Keano
 *
 */
public class StringReverse {
	
	public static void main(String args[]) {
		System.out.println(reverse("Keano Porcaro"));
	}
	
	public static String reverse(String s) {
		int length = s.length(), last = length - 1;
		char[] chars = s.toCharArray(); // ['k', 'e', 'a', 'n', 'o']
		for (int i = 0; i < length/2; i++) {
			char c = chars[i];
			chars[i] = chars[last - i];
			chars[last - i] = c;
		}
		return new String(chars);
	}
}
