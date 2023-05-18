package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class LocatorsOpencart {
	WebDriver driver;
	
	@Test
	public void OpenCartBrowser() throws InterruptedException {
		// On ChromeBrowser
		driver = Helper.startBrowser("GC");
		//1.Open URL "https://demo.opencart.com/index.php?route=account/register&language=en-gb"
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		//2.Enter All mandatory fields like FirstName,LastName,Email and Password.
		driver.findElement(By.id("input-firstname")).sendKeys("Sandhya");
		driver.findElement(By.id("input-lastname")).sendKeys("Ijjina");
		driver.findElement(By.name("email")).sendKeys("sandhyaijjina@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sandhya@7");
		Thread.sleep(3000);
	    WebElement checkbox = driver.findElement(By.name("agree"));
	    checkbox.submit();
	    //3.Click Continue Button
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();
	    //4.Verify HomePage Title name
	    String PageName = driver.getTitle();
	    System.out.println("HomePage Title Name is.." + PageName);
	    //5.Login in to "demo.opencart.com" with validate credentials
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Login']")).click();
	    driver.findElement(By.id("input-email")).sendKeys("sandhyaijjina@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Sandhya@7");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.quit();
	
	}
	

}
