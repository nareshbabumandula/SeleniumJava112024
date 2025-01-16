package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesTest {
	
	WebDriver driver;
	
	@BeforeClass
	void accessSite(){
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	void frameMethods() throws InterruptedException {
		driver.findElement(By.linkText("Autocomplete")).click();
		// driver.switchTo().frame(0); // To switch into the iframe based in iframe index
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // To switch into the iframe based in frame webelement
		driver.findElement(By.id("tags")).sendKeys("TestTag123");
		Thread.sleep(3000);
		driver.switchTo().defaultContent(); // To come out of the iframe
		driver.findElement(By.linkText("Draggable")).click();
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

}
