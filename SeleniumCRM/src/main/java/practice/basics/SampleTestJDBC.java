package practice.basics;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class SampleTestJDBC {

	public static void main(String[] args) throws Throwable {
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
	    	System.out.println(resultset.getString(1)+"\t"+resultset.getString(2));
	    }
	    
	    //close the connection
	    conn.close();
	    
		}

}
