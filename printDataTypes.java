package com.ngtlearning;

public class PrintDataTypes {

	public static void main(String[] args) {
		// int data range 2,147,483,647 to -2,147,483,648
		int intData = 2147483647;
		System.out.println("Printing intData... " + intData);
		System.out.println("Printing intData + 1 ..." + (intData+ 1));
		
		double doubleData = 9223372.036854775807;
		System.out.println("Printing doubleData... " + doubleData);
		
		//boolean data can either be true or false
		boolean booleanData = true;
		System.out.println("Printing booleanData... " + booleanData);
		
		//char data can hold single 16-bit Unicode character
		char charData = 'A';
		char charData1 = 19; //ASCII code for a char
		System.out.println("Printing charData... " + charData);
		System.out.println("Printing charData1... " + charData1);
		
		//Type Casting from int to double
		int i = 200;
		double d = i;
		System.out.println("Printing doubleData..." + d);
		
		//Type casting from double to int
		double d1 = 9223372.5;
		int i1 = (int)d1;
		System.out.println("Printing intData..." + i1);
		
		//Type casting from double to small
		short s= (short)d1;
		System.out.println("Printing shortData..." +s);
	}

}
