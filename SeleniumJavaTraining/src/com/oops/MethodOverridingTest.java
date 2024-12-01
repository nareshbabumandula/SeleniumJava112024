package com.oops;

public class MethodOverridingTest extends MethodOverloadTest{

	int a=100;
	int b=200;
	
	void add() {
		int c=a+b;
		System.out.println("Addition of a and b in sub class is : " +c);
	}
	
	void test(){
		super.add();
	}
		
	public MethodOverridingTest() {
		super();
	}
	
	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		mot.add();
		mot.test();
	}
}
