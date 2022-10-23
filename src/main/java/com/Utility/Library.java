package com.Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library extends BaseClass{
	public static ExtentTest test;
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void scroll(int a)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+a+")", "");
	}
	public static void scrollToElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", ele);
	}
	
	public static void screenShot(String Name)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:\\Users\\MAULI\\eclipse-workspace\\HybridFramework\\ScreenShots\\"+Name+".png");
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public static void screenShotElement(WebElement ele, String Name)
	{

		File src=ele.getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:\\Users\\MAULI\\eclipse-workspace\\HybridFramework\\ScreenShots\\"+Name+".png");
		try {
			FileUtils.copyFile(src, dstn);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void mouseHover(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.scrollToElement(ele);
	}
	
	public static void rightclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele);
	}
	
	public static void doubleClick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele);
	}
	
	public static void dropDown(WebElement ele,String value)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
	
	public static void switchOnWindow()
	{
		Set<String> a=driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(a);
		String c=lst.get(1);
		driver.switchTo().window(c);
	}
	public static void getTitleOfAllWindows()
	{
		Set<String> a=driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(a);
		for(String s:lst)
		{
			driver.switchTo().window(s);
			String y=driver.getTitle();
			int x=1;
			System.out.println("Title of window : "+x+"is : "+y);
			x++;
		}
		
	}
	
	public static void alertAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public static void alertText()
	{
		driver.switchTo().alert().getText();
	}
	public static void alertSendKeys(String val)
	{
		driver.switchTo().alert().sendKeys(val);
	}
	public static void sendKeys(WebElement ele,String key)
	{
		ele.sendKeys(key);
	}
	public static void refresh()
	{
		Actions act=new Actions(driver);
		act.keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
	}
	public static void dragNDrop(WebElement ele1,WebElement ele2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
