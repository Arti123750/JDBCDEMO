package com.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataDemo2 {
	
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/STUDENT";
	
	static final String USER="root";
	static final String PASS="root";
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement stmt=null;
		try
	{
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	System.out.println("Connecting Database Succesfully.......");
	Class.forName("com.mysql.jdbc.Driver");
	
	
	System.out.println("Inserting Data into DataBase");
	stmt=con.createStatement();
	
	String sql1="INSERT INTO STUDENT_INFO "+"values(12,'Pranajl','PATANA',78.32)";
	stmt.executeUpdate(sql1);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		}

}
