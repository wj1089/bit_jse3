package com.jse.inheritance;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		PhoneService service = new PhoneService();
		
		while(true) {
			System.out.println("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력");
			switch(scanner.nextInt()) {
			case 0: System.out.println("0. 종료"); return;
			case 1: System.out.println("원하는 정보를 적어주세요(전화번호,이름,회사).");
					for(int i=0;i<2;i++) {
						service.add(new Phone(scanner.next(),scanner.next(),scanner.next()));
					}
			break;
			case 2: System.out.println("핸드폰정보 출력");
					Phone[] phones = service.getPhones();
					for(int i=0;i<2;i++) {
						System.out.println(String.format("귀하께서 입력하신 정보는(전화번호,이름,회사) : %s, %s, %s 입니다.",
								phones[i].getPhoneNumber(),
								phones[i].getName(), 
								phones[i].getCompany()));
					}
			break;
			
			
			}
		}
	}
}
