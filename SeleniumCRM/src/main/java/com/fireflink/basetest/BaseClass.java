package com.fireflink.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public ExtentReports report;
	public WebDriver driver;

	@BeforeSuite
	public void configBS()
	{
		driver= new ChromeDriver();
				ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("Advance Report Title");
		spark.config().setReportName("CRM report");
		spark.config().setTheme(Theme.DARK);
		
		//add env information and create test
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("BROWSER", "CHROME");
		
		
	}
	
	@Test
	public void test10() {
		System.out.println("created");
		System.out.println("created1");
	}

}
