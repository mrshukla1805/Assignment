package com.parthdb.jdbc;

import java.sql.*;

public class MySQLDemo {
	public static void main(String[] args) throws Exception {
		//Loading Driver
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pracdb";
		Connection conn = DriverManager.getConnection(url,"root","1805");
		
		Statement st = conn.createStatement();
		
		String query = "create table intern (ID int primary key,ename varchar(10))";
		
		
		st.execute(query);
		
		System.out.println("Intern Table Successfully created");
	
		conn.close();
	}
}
