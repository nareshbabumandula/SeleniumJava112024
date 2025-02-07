package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTablesTest {
    WebDriver driver;

	@Test
	public void handleWebTable() {
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		System.out.println("No of rows are : " + rows.size());
		
		List<WebElement> columns = table.findElements(By.xpath(".//thead/tr/th"));
		System.out.println("No of columns are : " + columns.size());
		
		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j < columns.size(); j++) {
				String value = table.findElement(By.xpath(".//tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(value + " ");
				if (value.equals("Doe")) {
					String email = table.findElement(By.xpath(".//tbody/tr[" + i + "]/td[" + (j+4) + "]")).getText();
					System.out.println("Email address of Doe is : " + email);
					break;
				}
			}
			System.out.println();
		}
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
