package com.vanillaScript.testcases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC4MakeMyTrip {
	
	@Test
	public void makeMyTripTC() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Handle popup
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("webklipper-publisher-widget-container-notification-frame")));
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class='close']").click();
		driver.switchTo().defaultContent();
		
		//Click Hotels
		WebElement hotelEle = driver.findElement(By.xpath("//li[@class='menu_Hotels']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", hotelEle);
		
		// Enter city as Goa, and choose Goa, India		
		WebElement city = driver.findElementByXPath("//label[@for='city']");
		jse.executeScript("arguments[0].click()", city);
		WebElement enterCity = driver.findElementByXPath("//div[@role='combobox']//input[1]");
		enterCity.sendKeys("Goa");
		WebElement selectPlace = driver.findElementByXPath("//p[text()='Goa, India']");
		jse.executeScript("arguments[0].click()", selectPlace);
		
		// Enter Check in date as Next month 15th (May 15) and Check out as start date+5
		Calendar cal = GregorianCalendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("MMMM yyyy");
		Date currentMonth = new Date();
		cal.setTime(currentMonth);

		// Add next month
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+1);
		String nextMonthAsString = df.format(cal.getTime());
		String nextMonthInShort = nextMonthAsString.substring(0, 3);
     
		WebElement selectCheckInDate = driver.findElementByXPath("//div[contains(@aria-label,'"+nextMonthInShort+" 15')]");
		jse.executeScript("arguments[0].click()", selectCheckInDate);
		driver.findElementByXPath("//input[@data-cy='checkout']").click();
		WebElement selectCheckOutDate = driver.findElementByXPath("//div[contains(@aria-label,'"+nextMonthInShort+" 20')]");
		jse.executeScript("arguments[0].click()", selectCheckOutDate);
		
		// Click on ROOMS & GUESTS and click 2 Adults and one Children(age 12). Click Apply Button.
		driver.findElementByXPath("//input[@data-cy='guest']").click();
		driver.findElementByXPath("//li[@data-cy='adults-2']").click();
		driver.findElementByXPath("//li[@data-cy='children-1']").click();
		WebElement childAge = driver.findElementByXPath("//label[@class='lblAge']//select[1]");
		Select sel = new Select(childAge);
		sel.selectByVisibleText("12");
		driver.findElementByXPath("//button[text()='APPLY']").click();
		
		// Click Search button
		driver.findElementByXPath("(//button[@type='button'])[1]").click();
	
		// Select locality as Baga
		driver.findElementByXPath("//input[@placeholder='Enter location or property name']").sendKeys("Baga");
		driver.findElementByXPath("//span[text()='Baga, Goa']").click();
		
		//Select 5 start in Star Category under Select Filters
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hlistpg_fr_star_category']/ul[1]/li[2]/span[1]/label[1]")));
		driver.findElementByXPath("//div[@id='hlistpg_fr_star_category']/ul[1]/li[2]/span[1]/label[1]").click();
		
		// Click on the first resulting hotel 
		WebElement hotelNameEle = driver.findElementByXPath("(//p[@itemprop='name'])[1]");
		String hotelName = hotelNameEle.getText();
		hotelNameEle.click();
		
		//go to the new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowRefs = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowRefs.get(1));
		
		//Print the Hotel Name 
		System.out.println("Hotel name: "+hotelName);
		
		// Click on BOOK THIS NOW
		driver.findElementByXPath("//span[text()='Book this combo']").click();
		
		//handle popup
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_Modal modalCont']//span)[1]")));
		driver.findElementByXPath("(//div[@class='_Modal modalCont']//span)[1]").click();
		
		// Print the Total Payable amount
		String totalPayable = driver.findElementByXPath("//span[@id='revpg_total_payable_amt']").getText();
		System.out.println("totalPayable: "+totalPayable);
		
		// Close the browser
		//driver.quit();		
		
		
		
	}

}
