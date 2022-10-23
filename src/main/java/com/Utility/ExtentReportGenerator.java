package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	
	public static ExtentReports getReport()
	{
		String fpath="C:\\Users\\MAULI\\eclipse-workspace\\HybridFramework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(fpath);
		
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Costco Warehouse");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Cotsco USA");
		extent.setSystemInfo("Module", "Testing Env.");
		extent.setSystemInfo("Tool", "Selenium Webdriver");
		extent.setSystemInfo("QA Name", "Prasad D");
		return extent;
	}
	
	

}
