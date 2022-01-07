package com.sj.s8.game;

public class Knight extends Character implements Act {
	
	public void slash() {
		System.out.println("칼 휘두르기");
	}

	@Override
	public void attack() {
		this.slash();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}
