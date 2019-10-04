package com.jdbc.studentdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpadateDemo {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/STUDENT";
	
	static final String USER="root";
	static final String PASS="root";
	
	public static void main(String[] args) {
		
		//Connection con=null;
		
		String sql="UPDATE STUDENT_INFO WHERE MARKS>80";
		
		try(Connection con1=DriverManager.getConnection(DB_URL,USER,PASS);
	    Statement stmt=con1.createStatement();)		
				
		{
			stmt.executeQuery(sql);
			System.out.println("Database Updated Succesfully......");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
