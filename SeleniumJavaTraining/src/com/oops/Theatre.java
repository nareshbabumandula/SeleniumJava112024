package com.oops;

/**
 * Abstraction: Showing the functionality to the user by hiding the implementation
 * 
 * 1. We cannot instantiate an abstract class because abstract classes are partially implemented classes
 * 2. Abstract class may have a constructor
 * 3. Abstract class can be extended by its subclasses
 * 4. Abstract class may have abstract methods as well as non abstract methods, static methods as well
 * 5. To achieve 0 to 100% abstraction we can go for an abstract class
 * 6. We can extend only one abstract class at a time by the child class 
 * 
 */
public abstract class Theatre {
	
	// Concrete method/Method with body/Implementation
	void onlineTicketbooking() {
		System.out.println("onlineTicketbooking facility..!");
	}
	
	// abstract method/Method without body/without Implementation
	abstract void fireandSafety();
	abstract void carParking();
	abstract void bikeParking();
	abstract void cateferia();
	
	// static method
	static void soundSystem() {
		System.out.println("Dolby digital sound system is good to have");
	}
		
	// constructor
	public Theatre() {
		System.out.println("This is a no argument constructor of Theater class");
	}
		
	public static void main(String[] args) {
		//Cannot instantiate the type Theatre
		//Theatre t = new Theatre();
		soundSystem();
	}

}
