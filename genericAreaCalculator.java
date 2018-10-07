package com.ngtlearning;
import java.util.Scanner;

public class GenericAreaCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int selection = 1;
		while (selection != 0)
		{
			System.out.println("Select Option:");
			System.out.println("1.Area of Circle");
			System.out.println("2.Area of Rectangle");
			System.out.println("3.Volume of Sphere");
			System.out.println("3.Volume of Rectangular Prism");
			System.out.println("0. Exit");
			selection = in.nextInt();
			
			if (selection == 1){
				System.out.println("Enter the radius: ");
				int radius = in.nextInt();
				System.out.println(radius * radius * 3.14 + " is the area of the circle");
			
				
				
			}
			if (selection == 2) {
				System.out.println("Enter length: ");
				int length = in.nextInt();
				System.out.println("Enter width: ");
				int width = in.nextInt();
				System.out.println(length * width + " is the area of the rectangle. ");
				
			}
			if (selection == 3) {
				System.out.println("Enter radius: ");
				int Sradius = in.nextInt();
				double Fpart = Sradius * Sradius * 3.14 * 4;
				System.out.println(Fpart / 3 + " is the area of the rectangle. ");
		}
		System.out.println("Thanks for using this program. Come back soon!");
		in.close();
		

	}

	}}
