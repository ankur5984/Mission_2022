package com.app.core;

import java.util.Scanner;

public class MethodStudy {

	public static void main(String[] args) {
		int score = 10000;
		int levelCompleted = 5;
		int bonus = 100;
		boolean gameOver;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the match status : \t");
		gameOver = sc.nextBoolean();
		
		int targetScore = calculateScore(score, levelCompleted, bonus, gameOver);
		System.out.println("target is : "+ targetScore);
		sc.close();

		
	}
	
	public static int calculateScore(int score,int levelCompleted,int bonus,boolean gameStatus)
	{
		int finalScore = 0;
		if(gameStatus) {
			finalScore = score + (levelCompleted*bonus);
			return finalScore;
//			System.out.println("game is finished with "+ finalScore + " score");
		}else {
//			System.out.println("game is yet to be finished!!!! please enjoy the game and eat bhunja");
			return -1;
		}
		
	}

}
