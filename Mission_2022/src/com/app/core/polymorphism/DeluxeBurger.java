package com.app.core.polymorphism;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger(String name, String meat, double price, String breadRollType) {
		super(name, meat, price, breadRollType);
		// TODO Auto-generated constructor stub
	}

	public DeluxeBurger() {
		super("Deluxe", "Bacon & Cheese", 14.54, "Sesame Bun");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}
	
	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("No additional items can be added to a deluxe burger.");
	}
	
	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("No additional items can be added to a deluxe burger.");
	}
	
	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("No additional items can be added to a deluxe burger.");
	}
	
	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("No additional items can be added to a deluxe burger.");
	}
	
//	@Override
//	public double itemizeHamburger() {
//		return super.itemizeHamburger();
//	}
}
