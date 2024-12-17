package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethodsTest {
		
	public static void main(String[] args) throws InterruptedException {
		// WebDriver is a remote control interface that enables introspection and control of user agents (browsers).
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		if (title.contains("Contact and Email Forms")) {
			System.out.println("Page title is valid");
		} else {
			System.out.println("Page title is invalid");
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		driver.quit();

	}

}
