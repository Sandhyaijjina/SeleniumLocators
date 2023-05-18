package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class DemoID {

	WebDriver driver;

	@Test

	public void TestNameDemo() {
		driver = Helper.startBrowser("GC");
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=\"Log In\"]")).click();
		driver.findElement(By.name("email")).sendKeys("sandhyaijjina@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sandhay@7");
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
	}

}
