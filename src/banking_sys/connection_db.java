package banking_sys;

import java.sql.*;

public class connection_db { 
	    public static final String URL = "jdbc:mysql://localhost:3306/banksys";
	    public static final String USER = "root";
	    public static final String PASS = "Sidharth3";
	
	    public static Connection getConnection()
	    {
	      try {
	          return DriverManager.getConnection(URL, USER, PASS);
	      } catch (SQLException ex) {
	          throw new RuntimeException("Error connecting to the database", ex);
	      }
	    }
	    public static void main(String[] args) {
	        Connection connection = connection_db.getConnection();
	        try {
	        Statement st=connection.createStatement();
	        ResultSet rs = st.executeQuery("select * from emp");
	        while(rs.next()) {
	        	System.out.println(rs.getString(1)+" "+rs.getString(2));
	        }
	        	
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	    }
}
//    public connection_db() {
//    	try {
//    		String query="Select"
//    		Class.forName("com.mysql.cj.jdbc.driver");
//    	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksys","root","Sidharth3");
//    	    Statement s=con.createStatement();
//    	    
//    	}
//    	catch(Exception e)
//    	{
//    		e.printStackTrace();
//    	}
//    	
//	}
//}
    
//  public static void main(String[]args) {
//	  	try {
//	        Statement s=con.createStatement();
//	        ResultSet rs=s.executeQuery("select * from emp");
//    		while(rs.next())  
//    		System.out.println(rs.getString(1)+"  "+rs.getString(2));
//    		con.close();
//
//    	}
//    	catch(Exception e)
//    	{
//    		e.printStackTrace();
//    	}
//}
//}

//	public static void main(String args[]){  
//	try{  
//	Class.forName("com.mysql.cj.jdbc.Driver");  
//	Connection con=DriverManager.getConnection(  
//	"jdbc:mysql://localhost:3306/banksys","root","Sidharth3");   
//	Statement stmt=con.createStatement();  
//	ResultSet rs=stmt.executeQuery("select * from emp");  
//	while(rs.next())  
//	System.out.println(rs.getString(1)+"  "+rs.getString(2));  
//	con.close();  
//	}
//	catch(Exception e)
//	{ 
//		System.out.println(e);
//	}  
//	}  
//	
//}
  
