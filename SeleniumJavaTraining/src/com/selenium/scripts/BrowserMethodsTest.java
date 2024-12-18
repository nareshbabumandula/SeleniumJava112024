package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserMethodsTest {

	// WebDriver is a remote control interface that enables introspection and control of user agents (browsers).
	WebDriver driver;

	/**
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	 */
	@Parameters({"browserType"})
	@BeforeTest
	void accessSite(String browser) {
		switch (browser) {
		case "chrome": case "google":
			driver = new ChromeDriver();
			break;
		case "firefox": case "mozilla":
			driver = new FirefoxDriver();
			break;
		case "edge": case "chromium":
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		
		
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
	}

	@Test
	void browserMethods() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		if (title.contains("Contact and Email Forms")) {
			System.out.println("Page title is valid");
			Reporter.log("Page title is valid");
		} else {
			System.out.println("Page title is invalid");
			Reporter.log("Page title is invalid");
		}
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	void browserNavigationMethods() throws InterruptedException {
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
	}

	/**
	 * @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	 * @throws InterruptedException
	 */
	@AfterTest
	void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
