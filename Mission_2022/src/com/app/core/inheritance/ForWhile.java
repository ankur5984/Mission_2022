package com.app.core.inheritance;

public class ForWhile {

	public static void main(String[] args) {
		int result = 8;
		while(result>7) {
			result++;
			do {
				result--;
			}while(result>5);
			
			break;
		}
		
		System.out.println(result); //-->5 
		
		
	}

}
