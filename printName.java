package com.ngtlearning;
import java.util.Scanner;
public class PrintName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");
	    String name = in.nextLine();
	    System.out.println("How many times would you want your name printed? ");
	    byte ans = in.nextByte();
	    for (byte i = 1; i<= ans; i++){
	    	System.out.println(name);
	    }
		in.close();
		

	}

}
