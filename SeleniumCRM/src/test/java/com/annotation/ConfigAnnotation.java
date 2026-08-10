package com.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigAnnotation {

	
	@BeforeClass
	public void configBC() {
		System.out.println("execute BC");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("execute BM");
	}
	@Test
	public void createContact() {
		
		System.out.println("Executecreatecontcat");
	}
	@Test
	public void createContact1() {
			
		System.out.println("Executecreatecontcat 2ws");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("execute BM");
	}
	
	
	@AfterClass
	public void configAC() {
		System.out.println("execute BM");
	}
	
		
		
}
