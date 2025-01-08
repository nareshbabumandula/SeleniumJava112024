package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsTest {

	WebDriver driver;
	WebDriverWait wait;
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 */
	@BeforeClass
	void accessSite(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
			put("profile.default_content_setting_values.cookies", 2); // Block cookies
			put("profile.default_content_setting_values.popups", 2); // Block popups
		}});
		driver = new ChromeDriver(options);
		driver.get("https://www.cigniti.com/");
		driver.manage().window().maximize();
	}

	@Test 
	void actionsMethods() throws InterruptedException{
		Actions action = new Actions(driver);	
		WebElement industries = driver.findElement(By.linkText("Industries"));
		action.moveToElement(industries).perform();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement banking = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Banking")));
		banking.click();
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