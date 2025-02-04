package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenusTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> menus = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println("No of menus found are : " + menus.size());
		
		for(WebElement menu : menus) {
			System.out.println(menu.getText());
		}
		
		driver.quit();

	}

}
