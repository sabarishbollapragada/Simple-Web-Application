package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DatabaseController;
import pojo.Student;

public class DatabaseQuery {
	
	Connection con;
	PreparedStatement ps;
	
	public Student getDetails(int studentId) throws SQLException, ClassNotFoundException
	{
		Student student= null;
		System.out.println("get details" + studentId);
		con = DatabaseController.getConnection();
		System.out.println(con);
		ps = con.prepareStatement("select name,dept,degree,credits_scored,credits_required from studetails.student where student_id = ?");
		ps.setInt(1,studentId);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			String name = rs.getString(1);
			String dept = rs.getString(2);
			String degree = rs.getString(3);
			int credits_scored = rs.getInt(4);
			int credits_required = rs.getInt(5);
			
			student = new Student(name,dept,studentId,degree,credits_scored,credits_required);
			
			
		}
		
		return student;
		
	}

}
