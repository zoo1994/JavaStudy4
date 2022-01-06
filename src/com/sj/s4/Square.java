package com.sj.s4;

public class Square {
	public static int sero;
	int garo;

	public static void info() {
		System.out.println("Class Method");
	
	}
	public void info2() {
		System.out.println("Instanc Method");
		System.out.println(this.garo);
		System.out.println(Square.sero);
		
		
	}
}
