package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class TestScenarioLocatorLinktext {
	WebDriver driver;

	@Test
	public void LocatorsLinkTest() throws InterruptedException {
		driver = Helper.startBrowser("GC");
		// 1. Open URL "https://www.easemytrip.com/flights.html" on ChromeBrowser
		driver.navigate().to("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		// 2.Click on "Holiday" link and then click on "Hotels"
		// 3.Verify Holiday and Hotels Message
		driver.findElement(By.linkText("HOLIDAYS")).click();
		String HMessage = driver.findElement(By.xpath("//h1[text()='Turn Your Dream Holiday Into A Reality']"))
				.getText();
		
		if (HMessage.equals("Turn Your Dream Holiday Into A Reality")) {
			System.out.println("Verification of Hmessage is Passed!!!..");
		} else {
			System.out.println("Verification of Hmessage is Failed!!!..");
		}
		driver.findElement(By.linkText("HOTELS")).click();
		String HoMessage = driver.findElement(By.xpath("//h1[@class='hp_title']")).getText();
		if (HoMessage.equals("Same hotel, Cheapest price. Guaranteed!")) {
			System.out.println("Verification of Homessage is Passed!!!..");
		} else {
			System.out.println("Verification of Homessage is Failed!!!..");
		}
		// 4.Verify Home page title name
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Hotel Booking Online | Budget , Luxury & Cheap Hotel - EaseMyTrip")) {
		System.out.println("Verification of HomeTitle is Passed!!!..");
		} else {
		System.out.println("Verification of HomeTitle is Failed!!!..");
		}
		driver.quit();
	}

}
