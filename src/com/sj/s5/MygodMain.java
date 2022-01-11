package com.sj.s5;

public class MygodMain {

	public static void main(String[] args) {
		Mygod myGod = Mygod.makeGod();

		System.out.println(myGod);
		// SingleTon

		Mygod my2 = Mygod.makeGod();
		System.out.println(my2);
		System.out.println(Mygod.makeGod());
		System.out.println(Mygod.makeGod());
		System.out.println(Mygod.makeGod());
		System.out.println(Mygod.makeGod());
		System.out.println(Mygod.makeGod());
	}

}
