package com.app.exercise;

public class Main {

	public static void main(String[] args) {
		MegaBytesConverter.printMegaBytesAndKiloBtes(2500);
		System.out.println(BarkingDog.shouldWakeUp(true, 9));
		
		System.out.println(LeapYear.isLeapYear(1800));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-23.123, -23.1234));
		
		System.out.println(EqualSumChecker.hasEqualSum(2, 3, 6));
		System.out.println(EqualSumChecker.hasTeen(23,22,34));
	}

}
