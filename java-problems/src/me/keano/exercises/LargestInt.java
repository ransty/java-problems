package me.keano.exercises;

/**
 * Finds the largest integer in an integer array
 * @author Keano
 *
 */
public class LargestInt {

	public static void main(String[] args) {
		int[] test = new int[] {1, 2, 3, 4, 5, 6, 99, 2, 108, 792};
		System.out.println(largestInt(test));
	}
	
	public static int largestInt(int[] input) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

}
