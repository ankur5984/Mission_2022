package com.app.exercise;

public class PrimeNumbers {

	/**
	 * @param number
	 * @return true for prime and false for not prime
	 */
	public static boolean isPrime(int number) {

		boolean status = true;
		if (number == 1) {
			status = false;
		}

		// number = 41 --- 41/2 = 20 so loop start with 2 and goes till number/2
		// then if number%loop == 0 --then number is not prime or else is prime
		
		//1st condition could be for ( i = 2; i <= number / 2; i++)
		//but optimized could be for (i = 2; i <= square root of number; i++)
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				status = false;
			}
		}

		return status;

	}
	
	public static void printPrime(int[] arr) {
	   int count = 0;
	   for(int i=0;i<arr.length;i++) {
		   if(isPrime(arr[i])) {
			   System.out.println(arr[i]);
			   count++;
			   
		   }
		   if(count == 3) {
			   System.out.println("count reached to 3 so exiting the code");
			   break;
		   }
	   }
		
	
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printPrime(arr);
		
		System.out.println(isPrime(2));
	}

}
