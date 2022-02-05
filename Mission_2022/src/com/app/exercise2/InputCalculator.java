package com.app.exercise2;

import java.util.Scanner;

public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int counter = 0;
		while(true) {
			//System.out.println("Enter Number:");
			boolean isNumber = sc.hasNextInt();
			
			if(isNumber) {
				
				int number = sc.nextInt();
				counter++;
				sum+=number;
				
			}else {
				break;
			}
			
		}
		
		long avg = Math.round((double)sum/counter);
		sc.nextLine();
		System.out.println("SUM = "+sum+" AVG = "+avg);
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

}
