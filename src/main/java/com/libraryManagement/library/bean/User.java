package com.libraryManagement.library.bean;

public class User {
	
	private String name;
	private String password;
	private String flag;
	
	public User(String name, String password, String flag) {
		super();
		this.name = name;
		this.password = password;
		this.flag = flag;
	}
	public User() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	


}
