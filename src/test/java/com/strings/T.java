package com.strings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class T {

	

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
    
   @Test(invocationCount = 3)
	 public void testing()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title not matched ");
		
	}
	
	@AfterMethod
	public void tear()
	{
		driver.close();
	}
}
