package com.ngtlearning;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the side length of the square? ");
		int side = in.nextInt();
		System.out.println("Here is your Square:");
		for (int i = 1; i<= side; i++){
			System.out.println();
			for (int k = 1; k<= side; k++){
				System.out.print("* ");
			}
		}
		in.close();
		if (side >= 100) {
			System.out.println();
			System.out.println("Why is your side so big? ");
		}

	}

}
