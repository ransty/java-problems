package me.keano.exercises;

public class OddNumbers {

	public static void main(String[] args) {
		oddNumbers();
	}
	
	public static void oddNumbers() {
		for (int i = 1; i < 100; i+= 2) {
			System.out.println(i);
		}
	}

}