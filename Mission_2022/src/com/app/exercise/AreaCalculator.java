package com.app.exercise;

public class AreaCalculator {
	//private static final double PI = 3.14d; 
	public static double area(double radius) {
		if(radius>=0) {
			return (Math.PI*radius*radius);
		}
		return -1d;
	}
	
	public static double area(double x,double y) {
		if(x>=0 && y>=0) {
			return (x*y);
		}
		return -1d;
	}
}
