package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pojo.Student;

public class DaoClass {

	Student student = new Student();

	Student m() {
		Student s = new Student();
		return s;

	}

	public static Connection con() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "K2811286248k");
		System.out.println("success");
		return conn;
	}
//insert 

	public int insert() throws Exception {
		Connection c = con();
		PreparedStatement pst = c
				.prepareStatement("insert into student (sname,Mobno, address,presentstatus,std )values(?,?,?,?,?)");

		pst.setString(1, "Digu");
		pst.setInt(2, 842682);
		pst.setString(3, "jaipur");
		pst.setString(4, "p");
		pst.setString(5, "six");
		pst.executeUpdate();
		return 0;
	}
}
