package com.oops;

public class B extends A{
	int a=30; // These variable will be overriding the parent class values
	int b=50;
	
	void mul(){
		int c=a*b;
		System.out.println("Multiplication of a and b is : " +c);
	}
	
	public B() {
		System.out.println("Executing B class no argument constructor..!");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.add();
		b.sub();
		b.mul();
		System.out.println(b.a);
		System.out.println(b.b);
	}

}
