package com.ust.dataaccess;

import java.sql.*;

class DBAccessInJava {
	public static void main(String args[]) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustdb", "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from User");
				while (rs.next())
					System.out.println(rs.getString("name"));
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}