package com.corona.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ILoginDAO implements LoginDAO{
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ILoginDAO() {
		try {
			
			String mariaDB = "org.mariadb.jdbc.Driver";
			String mysql = "com.mysql.jdbc.Driver";
			
			String dataBaseUrl = "jdbc:mysql://localhost:3306/[데이터베이스]";
			String dataBaseId = "[DB아이디]";
			String dataBasePw = "[DB비밀번호]";
			Class.forName(mysql);
			conn = DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void select_member() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert_member() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete_member() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_member() {
		// TODO Auto-generated method stub
		
	}
	
}
