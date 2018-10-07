package com.ngtlearning;
import java.util.Scanner;

public class CircleAreaCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		int radius = in.nextInt();
		
		if (radius > 0){
			System.out.println("Valid Input...");
			double area;
			area = radius * radius * 3.14;
			System.out.println("The area of this circle is " + area);
		
		}else {
			System.out.println("Invalid Input...");
		
		}
		
		
		in.close();

	}

}
