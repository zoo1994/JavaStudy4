package com.sj.s9.himart;

public class Client {
	int money;
	int point;
	
	public void buy(Himart h) {
		 this.money = this.money-h.price;
		this.point = this.point+h.point;
		System.out.println("보유금액 : "+this.money);
		System.out.println("보유포인트 : " +this.point);
	}
	
	
	
}
