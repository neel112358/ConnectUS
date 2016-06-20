package com.connectUS;
//importing java + sql packages

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection
{
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/auconnect?useUnicode=yes&characterEncoding=UTF-8";
	   //static final String DB_URL = "jdbc:mysql://localhost/auconnect";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "12345";

	   //creating Connection Statement 
	   
	   private static Connection conn = null;
	   

		public static Connection getConnection() throws SQLException, ClassNotFoundException
		{
			if(conn != null)
				return conn;
			else
			{
				try{
					   //STEP 2: Register JDBC driver
					   Class.forName("com.mysql.jdbc.Driver");

					   //STEP 3: Open a connection
					   System.out.println("Connecting to database...(AUConnect Database)");
					   conn = DriverManager.getConnection(DB_URL,USER,PASS);
					   
					   return conn;
				}
				finally
				{}
			}
		}
		
		//Method to close the Connection
		public static void closeConnection() throws SQLException
		{
			try
			{
				if(conn != null)
					conn.close();
			}
			finally
			{}
		}
		
}