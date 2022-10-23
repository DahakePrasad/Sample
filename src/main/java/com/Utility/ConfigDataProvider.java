package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public static FileInputStream fis;
	
	public ConfigDataProvider()
	{
		String path="C:\\Users\\MAULI\\eclipse-workspace\\HybridFramework\\ConfigData\\Config.properties";
		try {
			
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

	public String getUrl()
	{
		return pro.getProperty("URL");
	}
	
	public String Report()
	{
		
		return pro.getProperty("Report");
	}
	
	public String screenshot()
	{
		return pro.getProperty("Screenshots");
	}

	public String excel()
	{
		return pro.getProperty("Excel");
	}
	

}
