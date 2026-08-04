package com.fireflink.basetest;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public ExtentReports report;
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

}
