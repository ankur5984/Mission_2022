package com.app.exercise;

public class NumberToWords {
	
	 public static void numberToWords(int number) {
		 
		    if (number < 0) {
		        System.out.println("Invalid Value");
		    }
		 
		    int reverseNumber = reverse(number);
		    for (int i = 0; i < getDigitCount(number); i++) {
		 
		        switch (reverseNumber % 10) {
		            case 0:
		                System.out.print("Zero ");
		                break;
		            case 1:
		                System.out.print("One ");
		                break;
		            case 2:
		                System.out.print("Two ");
		                break;
		            case 3:
		                System.out.print("Three ");
		                break;
		            case 4:
		                System.out.print("Four ");
		                break;
		            case 5:
		                System.out.print("Five ");
		                break;
		            case 6:
		                System.out.print("Six ");
		                break;
		            case 7:
		                System.out.print("Seven ");
		                break;
		            case 8:
		                System.out.print("Eight ");
		                break;
		            case 9:
		                System.out.print("Nine ");
		                break;
		            default:
		                break;
		        }
		        reverseNumber /= 10;
		    }
		 
		    System.out.println();
		}
	
	
	
	
	public static int reverse(int number) {
		int remainder = 0;
		while(number != 0) {
			remainder = (remainder*10)+(number%10);
			number/=10;
		}
		return remainder;
	}
	
	
	public static int getDigitCount(int number) {
		if(number < 1) {
			return -1;
		}
		int count =0;
		while(number!=0) {
			number/=10;
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println("count of digit in 100 is : "+ getDigitCount(100));
		System.out.println("count of digit in 100 is : "+ reverse(1000));
		numberToWords(100);
	}

}
