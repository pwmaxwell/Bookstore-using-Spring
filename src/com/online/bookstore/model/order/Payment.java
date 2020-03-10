package com.online.bookstore.model.order;

public class Payment implements PaymentInterface{
	
	public int cardNum;
	
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		cardNum = this.cardNum;
	} 
	
	
}
