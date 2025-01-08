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
		WebElement sampleForms = driver.findElement(By.linkText("Sample Forms"));
		System.out.println(sampleForms.isDisplayed());
		System.out.println(sampleForms.isEnabled());
		sampleForms.click();
		
    	// When we execute driver.findElement(By.id("some id")), a WebElement object is created internally by the RemoteWebDriver class, which implements this interface.
    	WebElement predefinedCounrties = driver.findElement(By.id("q9"));

    	// To work with a drop down list box we need to create an object for Select class explicitly. Since the there are methods like 
    	// selectByIndex, selectByVisibleText, selectByValue etc are available inside the Select class.
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
      	
      	System.out.println("For loop to iterate through the drop down list..!");
    	for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i).getText());
			
			if (countries.get(i).getText().equals("India")) {
				break;
			}
		}
    	
    	// Lambda Expression : Java Lambda Expression Syntax : (argument-list) -> {body}  
    	System.out.println("Lambda expression to iterate through the drop down list..!");
    	countries.forEach(name->System.out.println(name.getText()));
    	
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