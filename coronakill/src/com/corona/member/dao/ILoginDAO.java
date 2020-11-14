package com.corona.member.dao;

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
			
//			String dataBaseUrl = "jdbc:mysql://localhost:3306/[데이터베이스]";
//			String dataBaseId = "[DB아이디]";
//			String dataBasePw = "[DB비밀번호]";
			
			String dataBaseUrl = "jdbc:mysql://localhost:3306/BBS";
			String dataBaseId = "root";
			String dataBasePw = "1234";
			
			Class.forName(mysql);
			conn = DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean select_member(String userID, String userPassword) {
		System.out.println("select_member()");
		String SQL = "SELECT userPassword FROM USER WHERE userID = ? ";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if (rs.getString(1).equals(userPassword)) {
					System.out.println("Success Login");
					return true;
				}else {
					System.out.println("Fail Login");
					return false;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
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
