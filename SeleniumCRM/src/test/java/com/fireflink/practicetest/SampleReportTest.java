package com.fireflink.practicetest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {

	ExtentReports report;
	@BeforeSuite
	public void configBS()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("Advance Report Title");
		spark.config().setReportName("CRM report");
		spark.config().setTheme(Theme.DARK);
		
		//add env information and create test
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("BROWSER", "CHROME");
	}
	@AfterSuite
	public void configAS()
	{
		report.flush();
	}
	
	
	@Test
	public void Test1()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot eDriver = (TakesScreenshot)driver;
		String filePath = eDriver.getScreenshotAs(OutputType.BASE64);
		
		
		ExtentTest test = report.createTest("create contact");
		test.log(Status.INFO,"Login to app");
		test.log(Status.INFO,"navigate to contact page");
		

		System.out.println("create contact");
		if("HDFC".equals("HDFCC")) {
			test.log(Status.PASS, "Pass");
		}else {
			
			test.addScreenCaptureFromBase64String(filePath, "errorfile");
		}
		
		report.flush();

	}
	
	@Test
	public void Test2()
	{
		
		ExtentTest test = report.createTest("create contact");
		test.log(Status.INFO,"Login to app");
		test.log(Status.INFO,"navigate to contact page");
		

		System.out.println("create contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Pass");
		}else {
			test.log(Status.FAIL, "Fail");
		}
		
		

	}
	@Test
	public void Test3()
	{
		
		ExtentTest test = report.createTest("create contact");
		test.log(Status.INFO,"Login to app");
		test.log(Status.INFO,"navigate to contact page");
		

		System.out.println("create contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Pass");
		}else {
			test.log(Status.FAIL, "Fail");
		}
		
	

	}
}
