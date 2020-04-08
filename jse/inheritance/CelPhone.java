package com.jse.inheritance;

public class CelPhone extends Phone{
	
	private boolean portable;    //portable = 휴대성인지 아닌지?
	private String move;

	public CelPhone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);
//		this.portable = portable;//boolean으로 하면 결국this는 필요없다.
		setPortable(portable);
	}
	
	public boolean isPortable() {//boolean 타입만 is를 쓰인다!!
		return portable;
	}
	
	public void setPortable(boolean portable) {//boolean타입에 true & false를 알아야하기 때문에.
		if(portable) {
			this.move ="휴대가능";
		}else {
			this.move ="휴대불가능";
		}
	}
	
	public String getMove() {
		return move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
}
