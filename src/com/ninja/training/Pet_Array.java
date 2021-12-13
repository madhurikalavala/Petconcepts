package com.ninja.training;

import java.util.Arrays;

public class Pet_Array {

	public static void main(String[] args) {
		String[] petanimal={"fish","parrot","bunny","cat","dog"};
		String petname[]= {"shark","egreen","hoppty","meow","spott"};
		int petwt[] = {200,750,3500,5000,10000};
		int nlimbs[] = {0,2,3,4,4};
		int index = Arrays.binarySearch(petanimal,"bunny");
		System.out.println("index is:"+index);
		int bunnywt=petwt[index];
		System.out.println("bunnyweight is:"+bunnywt);
		System.out.println("\n for loop");
		for(int position=0;position<petname.length;position++)
		{
			System.out.println("pet animal name at index"+position+"is :"+petname[position]);
		}//end of for loop
		System.out.println("\n foreachloop");
		
		for(String individualpetname:petname)
		{
			System.out.println("petname is:"+ individualpetname);
		}//end of foreachloop

	}//end of main

}//end of class
