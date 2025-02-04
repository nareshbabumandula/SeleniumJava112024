package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCFHomepageLinksCountTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links found in homepage are : " + links.size());
		
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.quit();
	}
}
