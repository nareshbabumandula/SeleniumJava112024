package com.assignment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		boolean loginSuccess = false;
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String txtUsername = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials to execute Login:')]/b[1]")).getText(); 
		String txtPassword = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials to execute Login:')]/b[2]")).getText(); 
		driver.findElement(By.id("username")).sendKeys(txtUsername);
		driver.findElement(By.id("password")).sendKeys(txtPassword);
		driver.findElement(By.id("submit")).click();
		
		loginSuccess = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]")).isDisplayed();
		
		if (loginSuccess) {
			System.out.println("Successfully logged into the application");
		} else {
			System.out.println("Failed to login into the application");
		}
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
		System.out.println(timeStamp);
		String screenshotPath = "";
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+ "/screenshots/screenshot_" + timeStamp + ".png");
		System.out.println(destFile.getPath());
		FileUtils.copyFile(srcFile, destFile);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
