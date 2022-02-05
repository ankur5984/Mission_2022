package com.app.exercise2;

public class DiagonalStar {
	
	public static void printSquareStar(int number) {
		if(number<5) {
			System.out.println("Invalid Value");
		}
		else {
			for(int i=0;i<number;i++) {
				for(int j=0;j<number;j++) {
					if(i==j||i==0||j==0||j==number-1||i==number-1||i+j == number-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(" DIAGONAL STAR.");
		printSquareStar(9);

	}

}
