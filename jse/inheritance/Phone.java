package com.jse.inheritance;

public class Phone {
	
	private String phoneNumber;
	private String name;
	private String company;
	
	public Phone(String phoneNumber, String name, String company) {//이거에 의미는 한번씩하면 번거로우니 한번에 모와서 
		this.phoneNumber=phoneNumber;
		this.name=name;
		this.company=company;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}


	@Override//(an notation)
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company ;
	}
	
}
