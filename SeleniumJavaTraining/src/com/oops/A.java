package com.oops;

public class A {

	// Instance variables
	int a=10;
	int b=20;
	private int e=40;
	
	// static/global variables
	static int x=100;
	static int y=200;
	
	static{
		System.out.println("Executing a static block..!");
	}
	
	{
		System.out.println("Executing an instance block..!");
	}

	void add(){
		// local variable
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	void sub(){
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	static void modulus() {
		int c=y%x;
		System.out.println("Modulus of a and b is : " +c);
	}
	
	public A() {
		System.out.println("Executing A class no argument constructor..!");
	}


	public static void main(String[] args) {
		A a = new A();
		a.add();
		a.sub();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(x);
		System.out.println(y);
		modulus();
		A.modulus();
	}

}
