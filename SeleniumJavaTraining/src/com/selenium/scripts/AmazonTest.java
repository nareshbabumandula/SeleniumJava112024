package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	/**
	 * @BeforeSuite: The annotated method will be run before all tests in this suite have run.
	 */
	@BeforeSuite
	void launchBrowser() {
		System.out.println("Launched the browser");
	}
	
	/**
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	 */
	@BeforeTest
	void accessSite() {
		System.out.println("Accessed amazon website");
	}
	
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 */
	@BeforeClass
	void login() {
		System.out.println("Logged into amazon portal");
	}
		
	@Test(priority = 0)
	void searchProduct() {
		System.out.println("Searched the product");
	}
	
	@Test(priority = 1)
	void addToCart() {
		System.out.println("Added the product to cart");
	}
	
	@Test(priority = 2)
	void checkOut() {
		System.out.println("Checked out the product from the cart");
	}
	
	@Test(priority = 3)
	void proceedToBuy() {
		System.out.println("Proceeded to buy");
	}
	
	@Test(priority = 4)
	void placeOrder() {
		System.out.println("Order placed successfully");
	}
	
	@Test(priority = 5)
	void cancelOrder() {
		System.out.println("Order cancelled");
	}
	
	/**
	 * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 */
	@AfterClass
	void refunds() {
		System.out.println("Refunds generated");
	}
	
	/**
	 * @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	 */
	@AfterTest
	void logout() {
		System.out.println("Logged out from the application");
	}
	
	/**
	 * @AfterSuite: The annotated method will be run after all tests in this suite have run.
	 */
	@AfterSuite
	void closeBrowser() {
		System.out.println("Closed the browser");
	}


}
