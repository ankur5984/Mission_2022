package com.app.exercise;

public class NumberPalindrome {
	
	//worked
	public static boolean hasSharedDigit(int x,int y) {
		
		if((x>9 && x<=99)&& (y>9 && y<=99)) {
			
			while(x>0) {
				int temp =y;
				while(temp>0) {
					if(x%10 ==temp%10) {
						return true;
					}
					temp/=10;
					
				}
				x/=10;
			}
		}

		return false;
	}
	
	
	public static int getEvenDigitSum(int number) {
	
		if(number >= 0) {
			int sum=0;
			
			while(number !=0 ) {
				int temp = number % 10;
				number/=10;
				if(temp%2 == 0) {
					sum +=temp; 
				}
			}
			return sum;
		}
		
		
		return -1;
	}
	
	

	public static int sumFirstAndLastDigit(int number) {
		if(number<0) {
			return -1;
		}
		
		int sum = 0;
		int remainder = 0;
		sum += number%10; 
		while(number!=0) {
			remainder = number%10;
			number/=10;
		}
		
		//alternative
		/*
		 * 
		 while (number > 9) {
	        number /= 10;  
		    }
		 return lastDigit + number;
	
		 * 
		 */
		
		sum += remainder;
		return sum;
	}
	
	
	public static boolean isPalindrome(int number) {
		boolean status = false;
		
		
		int temp = number;
		int reverse = 0;
		while(number!=0) {
			reverse*=10;
			reverse += number%10;
			
			
			number/=10;
		}
		
		if(reverse == temp) {
			status = true;
		}
		
		return status;
	}
	
	public static boolean hasSameLastDigit(int x,int y,int z) {
		
		if(isValid(x) && isValid(y) && isValid(z)) {
			
			if(x%10 == y%10 || x%10 == z%10 || y%10 == z%10) {
				return true;
			}
		}
		
		
		return false;
	}
	
	public static boolean isValid(int x) {

		return x >= 10 && x <= 1000;
	}
	
//get greatest common divisor	
	public static int getGreatestCommonDivisor(int first,int second) {
		
		if(first < 10 || second < 10) {
			return -1;
		}
		
		int temp = 0;
		if(first > second) {
			while(second != 0) {
				temp = second;
				second = first%second;
				first = temp;
			}
			
			return first;
		}
		else {
			while(first != 0) {
				temp = first;
				first = second%first;
				second = temp;
			}
			
			return second;
		}
//		 
//		while(first != second) {
//			if(first > second) {
//				first = first - second;
//			}
//			else {
//				second = second - first;
//			}
//		}
//		return second;
	}
	
	////print factors of numbers
	public static void printFactors(int number) {
		if(number<1) {
			System.out.println("Invalid value");
		}
		else {
			for(int i =1;i<=number;i++) {
				if(number%i == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
	
////perfect number
	public static boolean isPerfectNumber(int number) {
		if (number < 1) {
			return false;
		}
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		
		return sum == number;
	}

	
	
	
	public static void main(String[] args) {
		System.out.println("121 is a palindrome =>"+ isPalindrome(121));
		System.out.println("121 is a palindrome =>"+ isPalindrome(-121));
		System.out.println("121 is a palindrome =>"+ sumFirstAndLastDigit(707));
		System.out.println("121 is a palindrome =>"+ isPalindrome(12133));
		
		
		System.out.println("EVEN DIGIT SUM in NUMBER =>"+ getEvenDigitSum(123456789));
		System.out.println("EVEN DIGIT SUM in NUMBER =>"+ getEvenDigitSum(2000));
		System.out.println("EVEN DIGIT SUM in NUMBER =>"+ getEvenDigitSum(-22));
		
		
		
		System.out.println("EVEN DIGIT SUM in NUMBER =>"+ hasSharedDigit(12,13));
		
		System.out.println(isPerfectNumber(6));
		
	}

}
