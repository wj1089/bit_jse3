package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private int count;
	
	public PhoneService() {
		phones = new Phone[2];
	}
	
	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	
}
