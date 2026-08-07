package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./configAppData/commondata.properties");
		Properties p1 = new Properties();
		p1.load(fis);
		String Data = p1.getProperty(key);
		
		return "Data";
	}
}

