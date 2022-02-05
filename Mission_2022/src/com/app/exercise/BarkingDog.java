package com.app.exercise;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		boolean status = false;
		if (barking == true) {
			if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) {
				status = true;
			}
		}
		return status;
		//or
//		return ((hourOfDay < 8 || hourOfDay > 22)  && hourOfDay >= 0 && hourOfDay <= 23 
//                && barking);
	}
}