
package com.ninja.training;

import java.util.Scanner;

public class Pet_Loops {
	static int maxAttempts = 3;

	public static void for_loop() {
		System.out.println("\n\n FOR LOOP");
// Using Scanner for Getting Input from User
		Scanner input = new Scanner(System.in);
		for (int attemptCount = 1; attemptCount <= maxAttempts; attemptCount++) {
			System.out.println("\n Attempt # = " + attemptCount);
			System.out.println("Enter the number of limbs and I will guess your pet (0-4) : ");
			int noOfLegs = input.nextInt();
			switch (noOfLegs) {
			case 0:
				System.out.println("Let me Guess! You have A pet Fish!");
				break;
			case 2:
				System.out.println("Let me Guess! You have A pet Parrot!");
				break;
			case 3:
				System.out.println("Let me Guess! You have A pet Bunny!");
				break;
			case 4:
				System.out.println("Let me Guess! You have A pet Dog or Cat!");
				break;
			default:
				System.out.println("Let me Guess! I think You DO NOT have A pet!");
			} // End of Switch
		} // End of For Loop
	
		System.out.println("You have completed Max attempts : " + maxAttempts);
	} // End of method for_loop

	public static void while_loop() {
		System.out.println("\n\n WHILE LOOP");
		int attemptCount = 0;
		Scanner input = new Scanner(System.in);
		while (attemptCount <=maxAttempts) {
			attemptCount = attemptCount + 1;
			System.out.println("\nAttempt # = " + attemptCount);
			System.out.println("Enter the number of limbs and I will guess your pet (0-4) : ");
			int noOfLegs = input.nextInt();
			switch (noOfLegs) {
			case 0:
				System.out.println("Let me Guess! You have A pet Fish!");
				break;
			case 2:
				System.out.println("Let me Guess! You have A pet Parrot or Bunny!");
				break;
			case 3:
				System.out.println("Let me Guess! You have A pet Dog or Cat!");
				break;
			default:
				System.out.println("Let me Guess! I think You DO NOT have A pet!");
			} // End Switch
		} // End While

		System.out.println("You have completed Max attempts : " + maxAttempts);
	} // End of method while_loop

	public static void do_while_loop() {
		System.out.println("\n\n DO WHILE LOOP");
		int attemptCount = 0;
		Scanner input = new Scanner(System.in);
		do {
			attemptCount = attemptCount + 1;
			System.out.println("\nAttempt # = " + attemptCount);
			System.out.println("Enter the number of limbs and I will guess your pet (0-4) : ");
			int noOfLegs = input.nextInt();
			switch (noOfLegs) {
			case 0:
				System.out.println("Let me Guess! You have A pet Fish!");
				break;
			case 2:
				System.out.println("Let me Guess! You have A pet Parrot or Bunny!");
				break;
			case 4:
				System.out.println("Let me Guess! You have A pet Dog or Cat!");
				break;
			default:
				System.out.println("Let me Guess! I think You DO NOT have A pet!");
			} // End Switch
		} while (attemptCount < maxAttempts);// End DO- While
		input.close();
		System.out.println("You have completed Max attempts : " + maxAttempts);
	} // End of method do_while_loop

	public static void main(String[] args) {
		for_loop();
		while_loop();
		do_while_loop();
	} // End of main method
}// End of class
