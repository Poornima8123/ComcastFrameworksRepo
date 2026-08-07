package practice.datadriventesting;


import java.sql.Statement;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class SampleUnitTestheckProjectInBackEndJDBC {

	
	@Test
	public  void projectTestCheck() throws Throwable {
		
		boolean flag = false;
		
		String expectedProjectName = "IBM123";
		// TODO Auto-generated method stub
		//load and register the data base
		Driver driverRef = new Driver();

		DriverManager.registerDriver(driverRef);
		
		//connect to database
	    Connection conn	=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Amma@8123");
	    System.out.println("======Done======");
	    
	    //create sql statement
	    Statement stat = conn.createStatement();
	    

	  //execute select query and get result
	    ResultSet resultset = stat.executeQuery("select*from project");
	    
	    while(resultset.next())
	    {
	    	String actProjectName = resultset.getString(2);
	    	if(expectedProjectName.equals(actProjectName))
	    	{
	    		flag=true;
	    		System.out.println(expectedProjectName+"is available==PASS");
	    	}
	    	
	    }
	    
	    if(flag==false)
	    {
	    	System.out.println(expectedProjectName+"is available==Fail");
	    }
	    
	    
	    //close the connection
	    conn.close();
	    
		}

}
