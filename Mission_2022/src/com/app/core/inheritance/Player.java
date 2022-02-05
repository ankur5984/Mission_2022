package com.app.core.inheritance;

//encapsulation exercise
public class Player {

	private String fullName;
	private String weapon;
	private int hitPoints=100;
	
	public Player(String name,String weapon,int health) {
		 this.fullName=name;
		 this.weapon=weapon;
		 if(health<0 && health>=100) {
			 this.hitPoints=health;
		 }
	}
}
