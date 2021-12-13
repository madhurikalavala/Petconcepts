package com.ninja.training;

import java.util.Scanner;

public class Pet_Switch {



public static void main(String[] args) {
// Using Scanner for Getting Input from User
Scanner input = new Scanner(System.in);



System.out.println("Enter the number of limbs and I will guess your pet (0-4) : ");
int noOfLegs = input.nextInt();
input.close();



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



} // End of Main



} // End of class
