package com.jse.inheritance;

public class PhoneService {
	
	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private int count;
	private GalaxyNote[] galaxyNotes;
	
	
	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		count = 0;
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
	}
	
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}

	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}

	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
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
	//이런걸 오버로딩이라한다.
	public void add(Phone phone) {//add를 전부 하나로 통일할수있다!
		phones[count] = phone;
		count++;
	}
	public void add(CelPhone phone) {//celPhoneAdd
		celPhones[count] = phone;
		count++;
	}
	public void add(Iphone Iphone) {//iphoneAdd
		iphones[count] = Iphone;
		count++;
	}
	public void add(GalaxyNote galaxyNote) {//galaxyNoteAdd
		galaxyNotes[count] = galaxyNote;
		count++;
	}
}
