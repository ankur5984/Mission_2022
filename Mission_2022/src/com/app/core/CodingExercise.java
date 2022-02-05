package com.app.core;

import java.util.HashMap;
import java.util.Map;

public class CodingExercise {

	public static void main(String[] args) {
		
		//String str = "(ab/b)*100";//appended string is : (12.0/10.0)*100
		String str = "ab-b";
		Map<String,Double> map = new HashMap<>();
		map.put("ab", 12.00);
		map.put("b", 10.00);
		
		double value = 0.00;
		StringBuilder strb = new StringBuilder();
		StringBuilder newString = new StringBuilder();
		
		for(int i =0;i<str.length();i++) {
			if (str.substring(i, i + 1).matches("[/\\-*+(){}0-9]")) {
				if(newString.isEmpty()) {
					strb.append(str.charAt(i));
				}
				else {
					value = map.get(newString.toString());
					strb.append(value);
					strb.append(str.charAt(i));
					newString.delete(0,newString.length());
				}
			}
			else {
				newString = newString.append(str.charAt(i));
			}
		}
		
		if(!newString.isEmpty()) {
			value = map.get(newString.toString());
			strb.append(value);
		}
		
		System.out.println("appended string is : "+ strb);
	}

}
