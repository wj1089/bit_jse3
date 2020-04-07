package com.jse.arr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CardService service= new CardService();
		
		while(true) {
			System.out.println("0.종료   1.카드 3장 받기(모양,숫자)   2.출력   ");
			switch(scanner.nextInt()) {
			case 0: System.out.println("시스템을 종료합니다."); return;
			
			case 1: System.out.println("카드 3장 받기(모양,숫자)"); 
				for(int i=0; i<3; i++) {//for문으로 3개장을 넣는작업
					service.add(new CardBean(scanner.next(),scanner.nextInt()));
//					CardBean card = ;//card는 현재 한장이다.
//					service.add(card);//카드빈에서 조건을 받아온다.//원래는 밖에있었으나 for문안에다 넣어준다.
					}
					break;
			case 2: 
					CardBean[] cards = service.getCards();//이 형식을 꼭기억하자 여러곳에서 뜯어오는것.
					for(int i=0;i<3;i++) {
						System.out.println(String.format("카드모양은 %s, 카드넘버는 %d", 
								cards[i].getKind(), cards[i].getNumber()));
					}//for로 입력하는건 똑같이 for로 출력하는것!! 중요하다.,
					break;
				
				
			}
		}
	}

}
