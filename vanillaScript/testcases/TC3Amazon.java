package com.vanillaScript.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC3Amazon {
	
	@Test
	public void amazonTC() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Type oneplus 7 pro mobiles and enter
		driver.findElementByXPath("(//input[@class='nav-input'])[1]").sendKeys("oneplus 7 pro mobiles",Keys.ENTER);
		
		// Print the price of the first resulting mobile
		String priceOfFirstMble = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("Price of first mobile: "+priceOfFirstMble);
		
		// Click on the Mobile (First resulting) image
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		// Switch to the new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowRefs = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowRefs.get(1));
		
		// Print the number of customer ratings
		String noOfCustRatings = driver.findElementByXPath("(//span[@id='acrCustomerReviewText'])[1]").getText();
		System.out.println("No of customer ratings: "+noOfCustRatings);
		
		// Click 'Add to Cart'
		driver.findElementById("add-to-cart-button").click();
		
		// Confirm "Added to Cart" text message appeared
		String textMsg;
		textMsg= driver.findElementByXPath("//div[contains(@class,'a-row a-size-medium')]//h1[1]").getText();
		System.out.println("Text message appeared as: "+textMsg);
		if(textMsg.trim().equals("Added to Cart")) {
			System.out.println("selected item added to cart");
		}else {
			System.err.println("selected item is not added to cart");
		}
		
		// Click on Proceed to checkout
		driver.findElementByXPath("(//a[@role='button'])[3]").click();
		
		// Confirm the title is "Amazon Sign In"
		System.out.println("Page title:" +driver.getTitle());
		if(driver.getTitle().equals("Amazon Sign In")) {
			System.out.println("page title is Amazon Sign In - confirmed");
		}else {
			System.err.println("page title is "+driver.getTitle()+"which is not a expected title");
		}
		
		// Click Continue (without entering mobile number / email)
		driver.findElementByXPath("//input[@id='continue']").click();
		
		// Verify the error message: Enter your email or mobile phone number
		String errMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println("error msg: "+errMsg);
		if(errMsg.trim().equals("Enter your email or mobile phone number")) {
			System.out.println("Error msg verified successfully");
		}else {
			System.err.println("Error msg verification fails");
		}
		
		// Close both browsers
		driver.close();	
		driver.switchTo().window(windowRefs.get(0));
		driver.close();
	}

}
