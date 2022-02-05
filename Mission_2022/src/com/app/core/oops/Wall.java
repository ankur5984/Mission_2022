package com.app.core.oops;

public class Wall {

	private double width;
	private double height;
	
	public Wall() {
		this(0.0,0.0);
		System.out.println("from default constructor");
	}

	public Wall(double width, double height) {
		System.out.println("calling parametrised constructor");
		this.width = width<0 ? 0.0 : width;
		this.height = height<0 ? 0.0 : height;
//		setWidth(width);
//		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width<0) {
			this.width = 0;
			return;
		}
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height<0) {
			this.height = 0;
			return;
		}
		this.height = height;
	}
	
	public double getArea() {
		return (getWidth()*getHeight());
	}
	
}
