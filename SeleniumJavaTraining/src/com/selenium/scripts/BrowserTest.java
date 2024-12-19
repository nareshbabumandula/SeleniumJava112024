package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserTest {
	
	WebDriver driver;
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 */
	@BeforeClass
	void accessSite(){
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
	}
	
	@Test  // Marks a class or a method as part of the test.
    void browserMethods() throws InterruptedException{
    	String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		if (title.contains("Contact and Email Forms")) {
			System.out.println("Page title is valid");
		} else {
			System.out.println("Page title is invalid");
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Sample Forms")).click();
	}
    
	@Test
    void browserNavigationMethods() throws InterruptedException {
    	driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getPageSource());
    }
       
	/**
	 * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 * @throws InterruptedException
	 */
	@AfterClass
    void closeBrowser() throws InterruptedException{
    	Thread.sleep(3000);
		driver.quit();
	}

}