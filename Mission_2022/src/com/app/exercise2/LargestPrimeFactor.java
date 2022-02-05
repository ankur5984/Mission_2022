package com.app.exercise2;

public class LargestPrimeFactor {
	
	public static int getLargestPrime(int number) {
		//if contains no prime factors and negative number
		if(number <= 1) {
			return -1;
		}
		
		//checking largest prime factor of a number
		for(int i =2; i< number;i++) {

			if(number%i == 0) {
				number = number/i; 
				i = i-1;
			}
		}

		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("largest prime factor of number is : "+ getLargestPrime(45));
	}

}
