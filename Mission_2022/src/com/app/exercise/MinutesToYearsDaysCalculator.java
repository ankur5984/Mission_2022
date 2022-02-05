package com.app.exercise;

public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
//		
//		if (minutes >= 0) {
//		long years = minutes / 525600;
//		long days = (minutes % 525600) / 1440;
//
//		System.out.println(minutes + " min = " + years + " y and " + days + " d");		
//		}
//		else {
//			System.out.println("Invalid Value");
//		}
//		

		if (minutes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		long years = minutes / 525600;
		long days = (minutes % 525600) / 1440;

		System.out.println(minutes + " min = " + years + " y and " + days + " d");

	}

	public static void printEqual(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Invalid Value");

		} else if (a == b && b == c) {
			System.out.println("All numbers are equal");
		} else if ((a != b && a == c) || (a != c && b == a) || (a != b && b == c)) {
			System.out.println("Neither all are equal or different");
		} else {
			System.out.println("All numbers are different");
		}
	}
	
	public static boolean isCatPlaying(boolean summer,int temperature) {
		boolean status = false;
//		if((temperature<=35 && temperature>25)&& (summer==false)) {
//			status =true;
//		}
		if(summer) {
			if((temperature<=45 && temperature>=25)) {
				status =true;
			}
		}
		else {
			if((temperature<=35 && temperature>=25)) {
				status =true;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		printEqual(2, 1, 1);
	}

}
