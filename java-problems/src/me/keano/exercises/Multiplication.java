package me.keano.exercises;

/**
 * Prints out a multiple table
 * @author Keano
 *
 */
public class Multiplication {
	
	public static void main(String args[]) {
		multipleTables(12);
	}

	public static void multipleTables( int max ) {
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.print(String.format("%4d", j * i));
			}
			System.out.println();
		}
	}
}
