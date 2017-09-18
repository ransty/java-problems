package me.keano.exercises;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Calculates the sum of integers from a text file, one int per line
 * @author Keano
 *
 */
public class SumOfInts {

	public static void main(String[] args) {
	}

	public static void sumFile(String name) {
		try {
			int total = 0;
			BufferedReader in = new BufferedReader (new FileReader(name));
			for (String s = in.readLine(); s != null; s = in.readLine()) {
				total += Integer.parseInt(s);
			}
			System.out.println(total);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
