package com.app.exercise;

public class SumAndDivisible {
	public static boolean isOdd(int number) {
		if(number > 0) {
			if(number%2 != 0) {
				return true;
			}
		}
		return false;
	}
	
	public static int sumOdd(int start,int end) {
		int i =start;
		int sum = 0;
		if(start > 0 && end > 0 && (start < end) || (start==end)) {
			for(i =start; i<=end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}
			return sum;
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1;i <= 1000;i++)
		{
			if((i % 3 == 0)&&(i % 5 == 0)) {
				System.out.println(i);
				count++;
				if(count == 5) {
					System.out.println("exiting code when count becomes 0");
					break;
				}
			}
		} 
		
		
	}

}
