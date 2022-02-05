package com.app.core.polymorphism;

public class Car {
	@SuppressWarnings("unused")
	private boolean engine;
	private int cylinders;
	private String name;
	@SuppressWarnings("unused")
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}

	public String startEngine(){
		return getClass().getSimpleName()+ " -> startEngine()";
	}
	
	
	public String accelerate(){
		return getClass().getSimpleName() + " -> accelerate()";
	}
	
	public String brake(){
		return getClass().getSimpleName()+ " -> brake()";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
	
	
	
}
