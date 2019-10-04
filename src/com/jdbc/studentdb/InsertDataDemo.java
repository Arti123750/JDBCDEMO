package com.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataDemo {
	 
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/STUDENT";
	
	static final String USER="root";
	static final String PASS="root";
	
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement prs1=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Data Base.......");
			
			con=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Loading Driver.......");
			
			System.out.println("Creating Statement.......");
			
			String sql="INSERT INTO STUDENT_INFO"+" VALUES(?,?,?,?)";	
			prs1=con.prepareStatement(sql);
			prs1.setInt(1, 10);
			prs1.setString(2, "TEJU");
			prs1.setString(3, "Kannad");
			prs1.setDouble(4, 87.65);
			prs1.execute();
			System.out.println("Inserted Record Succesfully.......");
			
			con.close();
			prs1.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			con.close();
			//prs.close();
			
		}
	}

}
