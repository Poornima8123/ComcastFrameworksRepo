package com.crm.remotetest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStack {
	
	@Test
	public void sampleTest() throws MalformedURLException {
		String username = "poornimahiremath8123";
		String password = "LT_vAIVaFALekw0Av2R86XTc1a7ZaUgepagDWXTZjqVzHkxj7A";
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("https://" + username + ":" + password + "@hub-cloud.browserstack.com/wd/hub"),null);
		
	}

}
