package com.selenium.scripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleWindowsTest {
    WebDriver driver;

	@Test
	public void handleMultipleWindows() {
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Register Now")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println(driver.getTitle());
		Iterator<String> iter = windows.iterator();
		
		while (iter.hasNext()) {
			String childWindow = iter.next();
			System.out.println("Window session ID : " + childWindow);
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
	}
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
