package com.corona.member.dao;

public interface LoginDAO {
	public boolean select_member(String userID, String userPassword);
	public void insert_member();
	public void delete_member();
	public void update_member();
}
