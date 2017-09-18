package me.keano.exercises;

/**
 * Converts RGB values to hexadecimal using toHexString Java API
 * @author Keano
 *
 */
public class RGBtoHex {

	public static void main(String[] args) {
		System.out.println(formatRGB(255, 0, 128));
	}
	
	public static String formatRGB(int r, int g, int b) {
		return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
	}
	
	public static String toHex(int c) {
		String s = Integer.toHexString(c);
		return (s.length() == 1) ? "0" + s : s;
	}

}
