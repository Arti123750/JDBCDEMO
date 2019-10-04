package com.jdbc.studentdb;
import java.sql.*;

public class StudentDemo {
	
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/STUDENT";
	
	static final String USER="root";
	static final String PASS="root";
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	//PreparedStatement p1=null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connectiog to database......");
		
		System.out.println("Loading Driver.......");
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("Creating Statement.....");
		//stmt=con.createStatement();
		String sql="INSERT INTO STUDENT_INFO"+" VALUES(?,?,?,?)";
	PreparedStatement p1=con.prepareStatement(sql);
		p1.setInt(1, 011);
		p1.setString(2, "SARA");
		p1.setString(3, "USA");
		p1.setDouble(4, 45.65);
		p1.execute();
		//stmt.executeUpdate(sql);
		System.out.println("Inserted record Succesfully....");
		
	/*	ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next())
		{
			int rno=rs.getInt("ROLL_NO");
			String name=rs.getString("NAME");
			String address=rs.getString("ADDRESS");
			double marks=rs.getDouble("MARKS");
			
			System.out.println("ROLL_NO: "+rno);
			System.out.println("NAME: "+name);
			System.out.println("ADDERESS: "+address);
			System.out.println("MARKS: "+marks);
		}*/
			
			//rs.close();
			p1.close();
			con.close();
			}
	catch (SQLException se) {
		// TODO: handle exception
		se.printStackTrace();
	}
		catch(Exception e)
	{
			e.printStackTrace();
	}
	/*finally
	{
		try {
			
			if(p1!=null)
			{
				p1.close();
			}
		} catch (SQLException se2) {
			// TODO: handle exception
			se2.printStackTrace();
		}
	}
		try {
			if(con!=null)
			{
				con.close();
			}
		
		} 
		catch (SQLException se3) {
			// TODO: handle exception
			se3.printStackTrace();
		}*/
		System.out.println("GOOD BYE....!");
	}
}


