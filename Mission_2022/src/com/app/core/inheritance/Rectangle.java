package com.app.core.inheritance;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle() {
		this(0.00,0.00);
	}


	public Rectangle(double width, double length) {
		
		this.width = width<0.00?0.00:width;
		this.length = length<0.00?0.00:length;
	}

	
	public double getWidth() {
		return width;
	}


	public double getLength() {
		return length;
	}


	
	public double getArea() {
		return (this.width*this.length);
	}
	
}
