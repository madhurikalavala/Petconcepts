package com.ninja.training;

import java.util.Scanner;



public class Pet_Decisions 

{

public static void main(String[] args) {



// Using Scanner for Getting Input from User
Scanner input = new Scanner(System.in);



System.out.println("Enter the number of limbs and I will guess your pet : ");
int noOfLimbs = input.nextInt();
input.close();



// If Only
System.out.println("\nIF STATEMENT");
if (noOfLimbs >= 0 && noOfLimbs <=4 && noOfLimbs!=1 ) {
System.out.println(" You have a pet with "+noOfLimbs+" limbs");
}



// If Else (Nested IF)
System.out.println("\nIF ELSE STATEMENT");



if (noOfLimbs >= 0  && noOfLimbs <=4 && !(noOfLimbs==1)) {
System.out.println(" You have a pet with "+noOfLimbs+" limbs");
}
else
{
System.out.println(" Sorry, I could not find a pet with "+noOfLimbs+" limbs");
}

//If Else If
//With just 1 LOC, this bracket is not necessary. But its best practice to use brackets always to avoid unintentional bugs.
System.out.println("\nIF ELSE IF STATEMENT");
if (noOfLimbs == 0)
System.out.println("You have a Fish!");
else if (noOfLimbs == 2 )
{
System.out.println("You have a Parrot!");
}
else if (noOfLimbs == 3) System.out.println("You have a rabbit");
else if (noOfLimbs == 4)
{
System.out.println("You have a dog or a cat!");
}
else {
System.out.println(" Sorry, I could not find a pet with "+noOfLimbs+" limbs");
}

//Ternary Operator



System.out.println("\nTERNARY / SHORTHAND IF STATEMENT");
boolean isDogOrFish = (noOfLimbs == 4 || noOfLimbs == 0) ? true : false;
if (isDogOrFish)
System.out.println(" Yes!!! You have a Dog or a Fish");
else
System.out.println(" Oh No!! You do not have a pet dog or a fish!");








} // End of Method main



}// End of Class
