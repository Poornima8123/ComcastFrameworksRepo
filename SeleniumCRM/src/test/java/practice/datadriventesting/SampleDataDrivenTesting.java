package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//get the java reprsentaion object of the pgysical file
		FileInputStream fls = new FileInputStream("C:\\Users\\User\\Desktop\\commondata.properties");

		//load all the keys from the properties class
		Properties pObj = new Properties();
		pObj.load(fls);
		
		//get the value based on key
		System.out.println(pObj.getProperty("browser"));
		
	}

}
