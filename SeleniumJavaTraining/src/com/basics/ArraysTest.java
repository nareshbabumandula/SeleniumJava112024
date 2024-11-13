package com.basics;

public class ArraysTest {

	public static void main(String[] args) {
		String[] names = {"Sowjanya", "Preethi", "Ram", "Naresh", "Noor", "Sajjad"};
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		System.out.println("Printing all elements of an array via for loop");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("Printing all elements of an array via enhanced for loop");
		for(String name : names) {
			System.out.println(name);
		}
		
		int[] marks = {10,25,30,85,90};
		
		// 1. Declare and then initialize the Array
		int[] arr; // Declaration
		arr = new int[5]; // Initialization with a size of 5
		arr[0]=10; // Assignment
		arr[1]=20;
		
		// 2. Declare and initialize on one step
		int[] score = new int[5]; // Create an array of size 5 with default values (0 for int)
		System.out.println(score[0]); // 0 as default value for integer is 0
		
		// 3. Declare and initialize the array with values
		int[] ranks = {1,2,3,4,5};
		
		// 4. Using the new keyword with values
        // An explicit new keyword can also be used to initialize the array with values
		int[] ar = new int[] {10,20,30,40,50};

	}

}
