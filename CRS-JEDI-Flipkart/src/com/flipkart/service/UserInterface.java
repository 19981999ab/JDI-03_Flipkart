package com.flipkart.service;

public interface UserInterface {
	public boolean updatePassword(int userID);
	public boolean verifyCredentials(int userID,String password);
}
