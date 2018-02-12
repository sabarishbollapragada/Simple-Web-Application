package connection;

import java.sql.*;
public class DatabaseController {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String URL = "jdbc:mysql://localhost:3306";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "sabarish";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
	   Connection conn=null;
	   
	   Class.forName(JDBC_DRIVER);
	   
	   conn= DriverManager.getConnection(URL,USER,PASS);
	   
	   System.out.println("connection" + conn);
	   
	   return conn;
	   
	   }

}
