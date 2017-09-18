package me.keano.exercises;

/**
 * Recursive Fibonacci function
 * @author Keano
 *
 */
public class Fibonacci {
	
	public static void main(String args[]) {
		for (int i = 0; i < 10; i ++) {
			System.out.print(fibonacci(i) + ", ");
		}
		System.out.println(fibonacci(10));
	}
	
	public static long fibonacci(int n) {
		return n <= 1 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
}
