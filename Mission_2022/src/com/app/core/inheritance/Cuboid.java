package com.app.core.inheritance;

public class Cuboid extends Rectangle {

	private double height;
	
	public Cuboid(double width,double length,double height) {
		super(width,length);
		this.height = height<0?0:height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
	  return (super.getArea()*this.height);
	}
}
