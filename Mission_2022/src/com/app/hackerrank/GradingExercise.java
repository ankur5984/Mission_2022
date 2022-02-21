package com.app.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingExercise {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int ele : grades ) {
			
			if(ele<38) {
				arr.add(ele);
				continue;
			}
			
			int rem = ele % 5;
			if(5-rem<3) {
				ele += 5-rem;
				arr.add(ele);
			}
			else {
				arr.add(ele);
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(73);
		arr.add(67);
		arr.add(38);
		arr.add(33);
		
		System.out.println(gradingStudents(arr));
		
	}

}
