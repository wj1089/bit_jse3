package com.jse.arr;

public class CardService {
	
	private CardBean[] cards;
	private int count;
	
	public CardService() {
		cards = new CardBean[3];
		count = 0;//여기 i는 Main에 for문 i를 초기화시켜주는작업.
	}
	public void setCards(CardBean[]cards) {
		this.cards=cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	
	public void add(CardBean card) {//3	
		cards[count] = card;//0을 적을 경우는 마지막수만 나오는데 i를 적어줄경우는 전체가 나온다.
		count++;//추가를 적어준다.
	}
	
}
