package com.app.exercise;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		boolean status = false;
		if(year>=1 && year<=9999) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				status = true;
			}
		}
		return status;
	}
	
	public static int getDaysInMonth(int month,int year) {
		
		if((month<1||month>12)||(year<1 || year >9999)) {
			return -1;
		}
		
		switch(month) {
		case 1:
			return 31;
		case 2:
			if(isLeapYear(year)) {
				return 29;
			}
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;	
		}
		return 0;	
	}
}
