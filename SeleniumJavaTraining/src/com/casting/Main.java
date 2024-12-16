package com.casting;

class Animal {
	
	void sound() {
		System.out.println("Animal makes a sound");
	}
	
	void walk() {
		System.out.println("Animal can walk");
	}
}

class Dog extends Animal{
	
	void sound() {
		System.out.println("Dog barks");
	}
	
	void fetch() {
		System.out.println("Dog fetches the ball");
	}
}

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Upcasting: It is the process of converting a subclass object into a superclass reference.
		 * Upcasting is automatically performed by Java and does not require explicit type casting
		 * Use case: 
		 *    1. To achieve polymorphism (using a superclass reference to refer to subclass objects)
		 *    2. It restricts access to only the methods and properties available in the super class
		 */
		
		Animal animal = new Dog(); // Upcasting: Dog object referenced by Animal
		animal.sound(); // Calls Dog's overridde method due to polymorphism
		animal.walk();
		// animal.fetch(); Error : fetch() is not accessible because it's not in Animal
		
		/*
		 * Downcasting: It is the process of converting a superclass reference back to subclass reference
		 * Downcasting is not automatically performed by Java and require explicit type casting
		 * Use case: 
		 *    1. To access subclass specific methods or fields that are not available in the superclass
		 */
		
		Dog dog = (Dog)animal; // Downcasting:Explicit cast to Dog
		dog.sound();
		dog.fetch(); // We are able to access because we have a Dog reference
		dog.walk();
		
		
	}
	
	
}

