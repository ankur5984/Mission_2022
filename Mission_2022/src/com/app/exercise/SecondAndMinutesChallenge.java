package com.app.exercise;

public class SecondAndMinutesChallenge {
	
	private static final String INVALID_VALUE = "invalid value";
	public static void main(String[] args) {
		
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945L));
		

	}
	
	private static String getDurationString(long minutes,long seconds) {
		if(minutes<0 || seconds >=60) {
			return INVALID_VALUE;
		}
		long hour = (long)minutes/60;
		long minRemainder = (long)(minutes%60) + (long)(seconds/60);
		long secRemainder = (long)(seconds%60);
		String hourway = ""+hour;
		String minutesway = ""+minRemainder;
		String secway = ""+secRemainder;
		if (hour < 10) {
			hourway = "0" + hourway;

		}
		if (minRemainder < 10) {
			minutesway = "0" + minutesway;
		}
		
		if (secRemainder < 10) {
			secway = "0" + secway;
		}
		
		return hourway+" h "+ minutesway+" m "+secway+ "s";
	}
	
	private static String getDurationString(long seconds) {
		if( seconds<0) {
			return INVALID_VALUE;
		}
		
		long minRemainder =  (long)(seconds/60);
		long secRemainder = (long)(seconds%60);
		return getDurationString(minRemainder, secRemainder);
	}

} 
