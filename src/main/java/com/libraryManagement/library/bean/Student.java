package com.libraryManagement.library.bean;

public class Student {
	private String student_name;
	private String email_id;
	private int contact;
	private String gender;
	private String flag;
	private String dob;
	private int age;
	public Student(String student_name, String email_id, int contact, int age, String gender, String flag,String dob) {
		super();
		this.student_name = student_name;
		this.email_id = email_id;
		this.contact = contact;
		this.gender = gender;
		this.flag = flag;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getContact() {
		return contact;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

}
