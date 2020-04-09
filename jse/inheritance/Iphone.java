package com.jse.inheritance;

public class Iphone extends CelPhone{
	

//	private boolean portable2;
	private String search;
	
	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	@Override
	public String toString() {
		return super.toString() + ",search = "+search;
	}
	
}
