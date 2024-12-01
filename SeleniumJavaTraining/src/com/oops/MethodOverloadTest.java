package com.oops;

public class MethodOverloadTest {
	
	int a=10;
	int b=20;
	
	void add() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of a and b with parameters is : " +c);
	}
	
	public MethodOverloadTest() {
		System.out.println("MethodOverloadTest no argument constructor..!");
	}
	
	public MethodOverloadTest(int a, int b) {
		System.out.println("MethodOverloadTest no argument constructor..!");
	}
	
		
	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.add(100, 50);
	}

}
