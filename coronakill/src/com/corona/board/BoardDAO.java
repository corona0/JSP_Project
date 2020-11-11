package com.corona.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//BoardDAO INSTANCE 생성시 Database연동
	public BoardDAO() {
		try {
			String dataBaseUrl = "jdbc:mysql://localhost:3306/[데이터베이스]";
			String dataBaseId = "[DB아이디]";
			String dataBasePw = "[DB비밀번호]";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dataBaseUrl,dataBaseId,dataBasePw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// The end of BoardDAO class
}
