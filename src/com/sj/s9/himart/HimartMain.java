package com.sj.s9.himart;

import com.sj.s8.game.Magition;

public class HimartMain {
	public static void main(String[] args) {
		
	Magition m ;
	Himart  hm  = new Himart();
	Tv tv = new Tv();
	Phone phone = new Phone();
	Computer com = new Computer();
	Client sj = new Client();
	
	Himart [] h1 = new Himart[3];
		
	
	tv.company = "삼성";
	tv.brand = "a";
	tv.point =3000;
	tv.price = 300;
	tv.size = 20;
	
	phone.company = "LG";
	phone.brand = "b";
	phone.pixel = 200;
	phone.price = 100;
	phone.point =200;
	
	com.brand = "c";
	com.company = "한성";
	com.price = 150;
	com.point = 500;
	com.cpu = "x";
	
	sj.money = 1000;
	sj.point = 0;
	
	sj.buy(tv);
	sj.buy(com);
	sj.buy(phone);
	

	}

}
