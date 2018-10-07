package com.ngtlearning;

public class ArraySample {

	public static void main(String[] args) {
		int[] myArray;
		myArray =new int[10];
		//assign a value to each array element one by one
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = i;
		}
		// print a value for entire array
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
		System.out.println();
		

	}

}
