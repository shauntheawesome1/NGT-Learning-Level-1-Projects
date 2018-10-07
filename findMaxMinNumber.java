package com.ngtlearning;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		int numbers [] = new int[] {100, 90, 67, 44, 56, 67, 72, 81, 56, 19};
		
		//assign first element of array to max and min number
		int max = numbers[0];
		int min = numbers[0];
		
		for (int i=1; i< numbers.length; i++)
		{
			
			if(numbers[i] > max)
				max = numbers[i];
			else if (numbers[i] < min)
				min = numbers[i];
		}
	
		System.out.println("max Number is : " + max);
		System.out.println("Min Number is : " + min);

	}

}
