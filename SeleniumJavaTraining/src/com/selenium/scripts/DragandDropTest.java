package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragandDropTest {
	
	WebDriver driver;
	
	@BeforeClass
	void accessSite(){
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	}
		
	@Test
	void dragandDropExample() throws InterruptedException {
		boolean bFlag=false;
		String errMsg="";
		try {
			driver.findElement(By.linkText("Droppable")).click();
			driver.switchTo().frame(0);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement destination = driver.findElement(By.id("droppable"));
			
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
			WebElement droppedText = driver.findElement(By.xpath("//p[contains(text(),'Dropped123!')]"));
			Assert.assertEquals(droppedText.isDisplayed(), false, "Failed to drop the object");
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
			errMsg = e.getMessage();
		}
		finally {
			if (bFlag) {
				Reporter.log("Successfully performed drag and drop operation");
				System.out.println("Successfully performed drag and drop operation");
			} else {
				Reporter.log("Failed to perform drag and drop operation since : " + errMsg);
				System.out.println("Failed to perform drag and drop operation since : " + errMsg);
			}
		}
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

}
