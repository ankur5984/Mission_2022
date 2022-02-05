package com.app.exercise2;

public class FlourPacker {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		boolean status = false;
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return status;
		}
		int bigValue = 5 * bigCount;
		int sum = bigValue + smallCount;
	
		
		if (sum > goal) {
			if(goal%5 > smallCount) {
				return status;
			}
		}
		
		if (sum >= goal) {
			status = true;
		}
		
		

		return status;
	}
	
	
	public static void main(String[] args) {
		System.out.println(canPack(1,0,5));
	}

}
