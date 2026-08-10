package com.fireflink.practicetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfoTest {
	
	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandName , String productName)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandName,Keys.ENTER);
		
		String x = "//span[text()='"+productName+"']/../../../../div[3]/div/div/div/div[2]/div/a/span/span/span[2]";
		String  price = driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj = new Object[3][2];
		obj[0][0]="iphone";
		obj[0][1]="iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera;";
		
		obj[1][0]="iphone";
		obj[1][1]="iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space";
		
		obj[2][0]="iphone";
		obj[2][1]="iPhone Air 256 GB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Ligh";
		
		return obj;
	

}
}
