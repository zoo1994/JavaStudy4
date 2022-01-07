package com.sj.s8.game;

public class Magition extends Character implements Act {
	
	int mp;
	
	private void spel () {
		System.out.println("마법 공격");
		
	}

	@Override
	public void attack() {
		this.spel();
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}
