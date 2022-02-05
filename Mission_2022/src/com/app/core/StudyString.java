package com.app.core;

public class StudyString {

	public static void main(String[] args) {
		
		boolean isAlien = false;
		if (isAlien == true)
			System.out.println("i am not an alien!");
		
		int result = 10;
		System.out.println(result++);//output --> 10 12
		System.out.println(result);
		System.out.println(++result);
		
		int topScore = 200;
		String a = "top";
		String b = "fail";
		//ternary operator
		String score = (topScore == 200)?a:b;
		System.out.println(score);
		
		boolean isCar = false;
		if(!isCar)//iscar != true or isCar == false
		{
			System.out.println(!isCar);
		}
		
		double firstNumber = 20.00d;
		double secondNumber = 80.00d;
		double sumMul = (firstNumber+secondNumber)*100.00d;
		System.out.println("sum and multiply = " + sumMul);
		double theRemainder = sumMul % 40.00d;
		System.out.println("the remainder = "+ theRemainder);
		
		boolean isNoRemainder = (theRemainder == 0)? true:false;
		System.out.println("isNoRemainder = " + isNoRemainder);
		
		if (!isNoRemainder)
		{
			System.out.println("got some remainder.");
		}
		
		
		
		boolean gameOver = true;
		int gameScore = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (gameScore < 5000) {
			System.out.println("your score is less than 5000");
		}else if(gameScore <1000) {
			System.out.println("your score is less than 1000");
		}else {
			System.out.println("got here");
		}
		
		int finalScore;
		if (gameOver)
		{//scope of if block finalScore can't access it beyond block
			 finalScore = gameScore + (levelCompleted*bonus);
			System.out.println("final score was "+finalScore);
		}
		
		gameScore = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			 finalScore = gameScore + (levelCompleted*bonus);
			 System.out.println("now the final score is "+ finalScore);
		}
	}

}
