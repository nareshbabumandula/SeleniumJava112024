package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragTest {
	
	WebDriver driver;
	
	@BeforeClass
	void accessSite(){
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	void frameMethods() throws InterruptedException {
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(draggable, 197, 170).perform();
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

}
