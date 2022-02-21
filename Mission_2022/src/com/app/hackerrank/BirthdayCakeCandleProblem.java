package com.app.hackerrank;

import java.util.*;

public class BirthdayCakeCandleProblem {

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
//		Collections.sort(candles);
//		int count = 1;
//		for(int i =0;i<candles.size()-1;i++) {
//			if(candles.get(i) == candles.get(candles.size()-1)) {
//				count++;
//			}
//		}
		int max = candles.get(0);
	    int count = 0;
	    for(int i=0; i<candles.size(); i++) {
	       max = (candles.get(i) > max)?candles.get(i):max;
	    }
	    for(int i = 0; i < candles.size(); i++) {
	        if (candles.get(i) == max)
	            count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		Collections.sort(arr);
		System.out.print(arr);
		System.out.println(birthdayCakeCandles(arr));
	}

}
