package com.oops;

public class A {

	int a=10;
	int b=20;
	
	static{
		System.out.println("Executing a static block..!");
	}
	
	{
		System.out.println("Executing an instance block..!");
	}

	void add(){
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	void sub(){
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
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
	}

}
