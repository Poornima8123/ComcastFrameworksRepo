package com.comcast.crm.listenerutility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImpClass implements ITestListener, ISuiteListener{
	
	public void onStart(ISuite suite)
	{
		System.out.println("Report Configuration");
	}
	
	public void onFinish(ISuite suite)
	{
		System.out.println("Report backup");
	}
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("=========="+result.getMethod().getMethodName()+">=========>");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("=========="+result.getMethod().getMethodName()+">=========>END=========");

	}
	
	
	
	


}
