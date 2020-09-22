package banking_sys;

import java.sql.*;

public class connection_db {
    Connection c;
    Statement s;
    
    public void con() {
    	try {
    		Class.forName("com.mysql.jdbc.driver");
    		c=DriverManager.getConnection("jdbc:mysql:///banksys","root","Sidharth3");
    		s=c.createStatement();	
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
}
