package com.basics;

public class Arithmetic {

	// Data members or properties or characteristics. a and b are called as variables if type int
	int a=10;
	int b=20;

	// User defined methods
	// Method : It's a block of code which gets executed only when we call it. Methods are used to increase code re-usability and security
	// Method without parameters/arguments and without return value
	void addition() {
		// implementation or logic or method body
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	// Method with parameters/arguments and without return value
	void subtraction(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " + c);
	}

	// Method without parameters/arguments and with return value
	int multiplication() {
		int c=a*b;
		return c;
	}

	// Method with parameters/arguments and with return value	
	int division(int a, int b) {
		int c=a/b;
		return c;
	}

	void modulus() {
		int c=b%a;
		System.out.println("Modulus of a and b is : " + c);
	}

	// No argument Constructor
	public Arithmetic() {
		System.out.println("This a no argument constructor..!");
	}

	// Parameterized Constructor
	public Arithmetic(int a, int b) {
		//this.a=a;
		//this.b=b;
		System.out.println("This a parameterized constructor..!");
	}

	public static void main(String[] args) {
		// To create an object reference for a class we need to follow/use the below syntax
		// ClassName objRef = new Constructor();
		// The Java compiler creates a default constructor when a class doesn't have a defined constructor.
		Arithmetic arth = new Arithmetic();
		arth.addition();
		arth.subtraction(100,200);
		int res = arth.multiplication();
		System.out.println("Multiplication of a and b is : " + res);
		int output = arth.division(40,10);
		System.out.println("Division of a and b is : " + output);
		arth.modulus();
	}

}
