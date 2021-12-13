
package com.ninja.training;
public class Pet_Operators {


	public static void main(String[] args) {
	//SUM & DIFFERENCE
	System.out.println("SUM AND DIFFERENCE");
	int catlimbs, combinedlimbs;
	int doglimbs = catlimbs=4, parrotlimbs=2;
	combinedlimbs = catlimbs +doglimbs + parrotlimbs;
	System.out.println("combined petlimbs is:"+combinedlimbs);
	int catweight=5000, dogweight = 10000;
	int diffinweight =dogweight - catweight;
	System.out.println("pet weight difference is:" +diffinweight);
	
	//PRODUCT & DIVISION
	System.out.println("\n PRODUCT AND DIVISION");
	int nfishes=15,fweight=200;
	int tfishweight=nfishes*fweight;
	System.out.println("the total weight in grams of"+nfishes +"is"+ tfishweight);
	int gramsperkg=1000;
	System.out.println("total weight of fish in kilograms is"+(tfishweight/gramsperkg));
	
	//MODULUS OPERATOR
	System.out.println("\n MODULUS");
	int fishweightkg = tfishweight/gramsperkg;
	int fishweightgrams=tfishweight%gramsperkg;
	System.out.println("My fishes weight:"+fishweightkg+"kg[using division]and"+fishweightgrams+"graams[using modulud]");
	
	
	/*
	* == : Equal To != : Not Equal To > : Greater Than < : Less Than >= : Greater
	* Than or Equal To <= : Less Than or Equal To.
	*/

	System.out.println("\nCOMPARISON");
	boolean isDogHeavierThanCat = dogweight > catweight;

	System.out.println("Is Dog Heavier? " + isDogHeavierThanCat);
	System.out.println("Is Cat Heavier? " + (dogweight < catweight));

	// Note to check equality, we use == AND NOT =
	// == is a comparison operator
	// = is an assignment operator
	boolean isCatLimbsEqualsParrotLimbs = (catlimbs == parrotlimbs);
	System.out.println(" Is catLimbs (" + catlimbs + ") equals parrotLimbs : " + isCatLimbsEqualsParrotLimbs);

	
	// Logical Operator
	/*
	* && -> Logical AND || -> Logical OR | -> Logical NOT
	*/

	System.out.println("\nLOGICAL OPERATOR");
	boolean isDogHeaviest = dogweight >= catweight && dogweight >= fweight;
	System.out.println("Is Dog heavier than cat and fish ? " + isDogHeaviest);

	boolean isCatHeavy = catweight >= dogweight || catweight >= fweight;
	System.out.println("Is cat heavier than dog or fish or both? " + isCatHeavy);

	boolean isFishLessThanKilo = !(fweight > gramsperkg); // Same as fishWeight <= gramsPerKg
	System.out.println(" Is combined age of pets not greater than 10 ? " + isFishLessThanKilo);

	}//end of main method

}//end of main class
