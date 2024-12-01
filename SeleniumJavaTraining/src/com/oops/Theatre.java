package com.oops;

public abstract class Theatre {
	
	// Concrete method/Method with body/Implementation
	void onlineTicketbooking() {
		System.out.println("onlineTicketbooking facility..!");
	}
	
	// abstract method/Method without body/without Implementation
	abstract void fireandSafety();
	
	// constructor
	public Theatre() {
		System.out.println("This is a no argument constructor of Theater class");
	}

	public static void main(String[] args) {
		//Cannot instantiate the type Theatre
		//Theatre t = new Theatre();

	}

}
