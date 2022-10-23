package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static ConfigDataProvider config;
	public static WebDriver driver;
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(BrowserName.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		
	driver.get(config.getUrl());
	driver.manage().window().maximize();
		
		
	}
	
	public void tearDown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
