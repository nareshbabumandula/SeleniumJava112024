package com.selenium.scripts;

import java.time.Duration;

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
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test
	void frameMethods() throws InterruptedException {
		
		try {
			driver.findElement(By.linkText("Autocomplete")).click();
			// driver.switchTo().frame(0); // To switch into the iframe based in iframe index
			driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // To switch into the iframe based in frame webelement
			driver.findElement(By.id("tags123")).sendKeys("TestTag123");
			Thread.sleep(3000);
		} catch (Exception e) {
			driver.switchTo().defaultContent(); // To come out of the iframe
			driver.findElement(By.linkText("Draggable")).click();
		}finally {
			System.out.println("Executed finally block..!");
		}
		
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

}
