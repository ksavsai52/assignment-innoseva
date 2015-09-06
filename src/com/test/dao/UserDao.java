package com.test.dao;

import java.util.List;

import com.test.entity.User;
import com.test.util.Helper;

public class UserDao {

	private String path = "";
	
	public UserDao(String path) {
		this.path = path;
	}
	
	public boolean isPresent(User user) {
		try {
			Helper helper = new Helper(path);
			List<String[]> table = helper.getTable();
			for (String[] data : table) {
				if (data[0].equals(user.getFirstName()) && data[1].equals(user.getLastName()) && data[2].equals(user.getPhoneNumber()) && data[3].equals(user.getAddress())) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
}
