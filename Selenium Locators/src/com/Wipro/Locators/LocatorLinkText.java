package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class LocatorLinkText {
	
	WebDriver driver;
	@Test
	public void linkslocator() {
		driver = Helper.startBrowser("GC");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Login")).click();
	    
	    List<WebElement> links = driver.findElements(By.xpath("//a"));
	    int linkcount = links.size();
	    System.out.println("Number of Links:" + linkcount);
	    for( int i = 1; i< links.size();i++) {
	    	System.out.println(links.get(i).getText());
	    }
	    driver.quit();
	}
	

}
