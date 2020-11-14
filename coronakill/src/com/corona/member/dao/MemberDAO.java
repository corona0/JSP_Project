package com.corona.member.dao;

public interface MemberDAO {
	public boolean select_member(String userID, String userPassword);
	public boolean insert_member();
	public void delete_member();
	public void update_member();
}
