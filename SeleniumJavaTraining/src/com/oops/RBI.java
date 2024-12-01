package com.oops;

/**
 * interface: It is a blueprint/template which is created to define rules
 * 
 * 1. We cannot instantiate an interface class because it doesn't have method implementation
 * 2. interface cannot have a constructor
 * 3. interface can be implemented by its implementation classes
 * 4. interface may have static, default methods along with abstract methods
 * 5. To achieve 100% abstraction we can go for an interface
 * 6. We can extend multiple interfaces from one interface
 * 7. By default all the methods are public, abstract and final in an interface
 * 8. Variables defined in an interface are treated like constants which can't be modified
 * 
 */
interface RBI {
	
	double minDeposit=100;
	
	void setInterestRate();
	void setWithdrwalLimit();
	void displayGuidelines();
	void setKYC();
	
	static void dematAccount() {
		System.out.println("Demat account facility is available");
	}
	
	default void branches() {
		System.out.println("Bank can have multiple branches");
	}
	

}

