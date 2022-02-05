package com.app.core;

public class Switch {
	private static final char CONST_CHAR_A = 'A';
	private static final char CONST_CHAR_B = 'B';
	private static final char CONST_CHAR_C = 'C';
	private static final char CONST_CHAR_D = 'D';
	private static final char CONST_CHAR_E = 'E';

	public static void main(String[] args) {
		final char CH = 'A';

		switch (CH) {
		case CONST_CHAR_A:
			System.out.println("A char is choosen");
			break;
		case CONST_CHAR_B:
			System.out.println("B char is choosen");
			break;
		case CONST_CHAR_C:
			System.out.println("C char is choosen"); 
			break;
		case CONST_CHAR_D:
			System.out.println("D char is choosen");
			break;
		case CONST_CHAR_E:
			System.out.println("E char is choosen");
			break;
		default:
			System.out.println("invalid choice");
			break;
		}

	}
}
