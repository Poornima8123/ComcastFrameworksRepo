package com.fireflink.practicetest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test {
	
	@Test(dataProvider = "getData")
	public void createContactTest(String firstName , String lastName)
	{
		
		System.out.println("FirstName : " + firstName+ ",LastName:" + lastName);
		
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj = new Object[3][2];
		obj[0][0]="poornima";
		obj[0][1]="Hiremath";
		
		obj[1][0]="prajwal";
		obj[1][1]="Hiremath";
		
		obj[2][0]="poornima";
		obj[2][1]="poornima";
		
		return obj;
	}
	
	


}
