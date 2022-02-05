package com.app.exercise;

public class Assignment {

	public static long toMilesPerHour(double kilometersPerHour) {
		if (!(kilometersPerHour < 0)) {
			return Math.round(kilometersPerHour / 1.609);
		}
		return -1;
	}

	public static void printConversion(double kilometersPerHour) {
		long milesPerHour = toMilesPerHour(kilometersPerHour);
		if (milesPerHour != -1) {
			System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
		} else {
			System.out.println("Invalid Value");
		}
	}

	public static void main(String[] args) {
		printConversion(10.25);
	}

}
