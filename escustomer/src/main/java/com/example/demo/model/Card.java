package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Card {
	private String type;
	private String cardNo;
//	private java.sql.Date expiredDate;
	private String expiredDate;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String type, String cardNo, String expiredDate) {
		super();
		this.type = type;
		this.cardNo = cardNo;
		this.expiredDate = expiredDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	@Override
	public String toString() {
		return "Card [type=" + type + ", cardNo=" + cardNo + ", expiredDate="
				+ expiredDate + "]";
	}
	
	
}
