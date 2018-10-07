/*******ADDITION.JAVA*******/

package com.ngtlearning;

public class Addition {
	
	int firstNumber;
	int secondNumber;
	
	public Addition(int num1, int num2)
	{
		firstNumber = num1;
		secondNumber = num2;
	}

	public int getTotal()
	{
		return (firstNumber + secondNumber);
	}
}

/*******MATH.JAVA********/
package com.ngtlearning;

public class Math {

	public static void main(String[] args) {
		Addition add = new Addition(3, 6);
		Addition add1 = new Addition(234, 470);
		
		System.out.println(add.getTotal());
		System.out.println(add1.getTotal());

	}

}
