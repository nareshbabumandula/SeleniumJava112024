package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownTest {
	
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
	
	@Test 
    void dropdownMethods() throws InterruptedException{
    	driver.findElement(By.linkText("Sample Forms")).click();
    	WebElement predefinedCounrties = driver.findElement(By.id("q9"));
        	
    	Select country = new Select(predefinedCounrties);
    	country.selectByIndex(0);
    	Thread.sleep(1000);
    	country.selectByIndex(1);
    	Thread.sleep(1000);
    	country.selectByIndex(2);
    	Thread.sleep(1000);
    	country.selectByIndex(3);
    	Thread.sleep(1000);
    	country.selectByIndex(4);
    	Thread.sleep(1000);
    	country.selectByVisibleText("India");
    	
      	List<WebElement> countries = country.getOptions();
      	System.out.println("No of pre-defined countries displayed in the dropdown are  : " + countries.size());
      	
    	for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i).getText());
			
			if (countries.get(i).getText().equals("India")) {
				break;
			}
		}
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