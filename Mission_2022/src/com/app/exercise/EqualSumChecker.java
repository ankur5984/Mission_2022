package com.app.exercise;

public class EqualSumChecker {
	public static boolean hasEqualSum(int a,int b,int c) {
		return ((a+b)==c);
	}
	
	public static boolean hasTeen(int a,int b,int c) {
		boolean status = false;
		if((13<=a && a<=19)||(13<=b && b<=19)||(13<=c && c<=19)) {
			status =true;
		}
		return status;
	}
	
	public static boolean isTeen(int a) {
		boolean status = false;
		if(13<=a && a<=19) {
			status =true;
		}
		return status;
	}
}
