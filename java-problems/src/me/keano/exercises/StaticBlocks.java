package me.keano.exercises;

import java.util.Scanner;

public class StaticBlocks {
	
	static int B;
	static int H;
	static boolean flag;
	
	
	static {
		flag = true;
		Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			H = sc.nextInt();
			if ((B<=0)||(B>=100) || ((H<=0)||(H>=100))) {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
				flag = false;
			}
			sc.close();
	}
	
	public static void main(String args[]) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
	
	

}
