package com.oops;

public class C extends B{
	
	void div(){
		int c=b/a;
		System.out.println("Division of a and b is : " +c);
	}
	
	public C() {
		System.out.println("Executing C class no argument constructor..!");
	}

	public static void main(String[] args) {
		C c = new C();
		c.add();
		c.sub();
		c.mul();
		c.div();
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
