package com.app.core;

public class ByteShortIntLongPrimitive {

	public static void main(String[] args) {
		
		int myalue = 20000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer Min value = " + myMinIntValue);
		System.out.println("Integer Max value = " + myMaxIntValue);
		
		System.out.println("Busted Max value = "+ (myMaxIntValue +1));
		System.out.println("Busted Max value = "+ (myMinIntValue -1));
		
		byte byteLiteral = 20;
		short shortLiteral = 30;
		
		long longLiteral = 50000L + (10L*(byteLiteral+myalue+shortLiteral)) ;
		
		System.out.println("the value of long is " + longLiteral);
		
		
		float f = 10f/3f;
		double d = 10d/3d;
		
		System.out.println(f + " " +d);
	}

}
