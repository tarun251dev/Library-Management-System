package com.libraryManagement.library.bean;



public class IssueBook {
	
	private int book_id;
	private String student_name;
	private int student_id;
	private String contact;
	private String issue_date;
	private String return_date;
	private int period;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public String setIssue_date(String issue_date) {
		return this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public String setReturn_date(String return_date) {
		return this.return_date = return_date;
	}
	public int getPeriod() {
		return period;
	}
	public int setPeriod(int period) {
		return this.period = period;
	}
public IssueBook(int book_id, String student_name, int student_id, String contact, String issue_date,
			 int period) {
		super();
		this.book_id = book_id;
		this.student_name = student_name;
		this.student_id = student_id;
		this.contact = contact;
		this.issue_date = issue_date;
		this.period = period;
	}
	public IssueBook() {
		// TODO Auto-generated constructor stub
	}
	public IssueBook(String return_date, int student_id, int book_id) {
		// TODO Auto-generated constructor stub
		this.return_date = return_date;
		this.student_id=student_id;
		this.book_id = book_id;
		

	}
	
	
	
	}
