package com.libraryManagement.library.bean;

public class AddLibrarian {

	@Override
	public String toString() {
		return "AddLibrarian [adminid=" + adminid + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", contact=" + contact + "]";
	}
     
	private int adminid;
	private String name;
	private String password;
	private String email;
	private String address;
	private String city;
	private String contact;
	private String flag;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	
	public AddLibrarian() {}
	
		public AddLibrarian(String name, String password, String email, String address, String city, String contact,String flag) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contact = contact;
		this.flag = flag;

	}

			

			public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
