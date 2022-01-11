package com.sj.s5;

public class Mygod {
	private static Mygod myGod;

	private Mygod() {
	}

	public static Mygod makeGod() {

		if (Mygod.myGod == null) {
			Mygod.myGod = new Mygod();
		}

		return Mygod.myGod;
	}

}