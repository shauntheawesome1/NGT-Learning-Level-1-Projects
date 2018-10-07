package com.ngtlearning;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int guessesLeft = in.nextInt();
		Random ran = new Random();
		int number = ran.nextInt(501);
		System.out.println("I'm thinking of a number between 0 and 500");
		
			
		while (guessesLeft !=0)
		{
			System.out.println("You have " + guessesLeft + " more tries left");
			System.out.println("Enter your guess: ");
			int ans = in.nextInt();
			
			if (ans > number){
				System.out.println("Wrong. Number is too High. ");
				guessesLeft--;
				if (guessesLeft == 0){
					System.out.println("Sorry, you lose. Please try again some other time!");
				}
			}
			
			if (ans < number){
				System.out.println("Wrong. Number is too Low. ");
				guessesLeft--;
				if (guessesLeft == 0){
					System.out.println("Sorry, you lose. Please try again some other time! ");
				}
			}
			
			if (ans == number){
				System.out.println("Correct! That is the Number");
				guessesLeft = 0;
			}
		}
		System.out.println("Thanks for playing my game! Please come back another time!");
		in.close();
	
	}

}
