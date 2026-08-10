package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
		
		Random random = new Random();
		int randomNumber = random.nextInt(5000);
		return randomNumber;
		
		
		
	}
	public String getSystemDateYYYYDDDMM() {
		
		Date dateObj = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
		
	}

}
