package com.comcast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JosnUtility {
	
	public String getDataFromJsonFile(String key) throws FileNotFoundException {
		
		FileReader fileR = new FileReader("./configAppData/appCommonData.json");
		JsonParser parser = new JsonParser();
		Object obj = parser.parse(fileR);
		JsonObject map = (JsonObject)obj;
		String data = (String) map.get(key);
		return data;
		
	}

	
}
