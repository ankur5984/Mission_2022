package com.app.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
	
	public static void minMax(List<Integer> arr) {
		//1,2,3,4,5
		//1 --> 2+3+4+5 = 14, 2 --> 1+3+4+5 = 13, 3 --> 1+2+4+5=12, 4 --> 1+2+3+5=11, 1+2+3+4=10
		//min = 10, max =14
		
		//long sum = 0L;
	//	List<Long> sumEle = new ArrayList<Long>();
		
		//below logic failed for duplicate element in array for example: 4,4,4,4,4
//		for(int i = 0; i< arr.size();i++) {
//			for(int j = 0; j<arr.size(); j++) {
//				if(arr.get(j) != arr.get(i)) //here it will fail{
//					sum+=arr.get(j);
//				}
//			}
//			sumEle.add(sum);
//			sum = 0;
//		}
		
		//	Collections.sort(sumEle);
		
		//	System.out.println(sumEle.get(0)+ " "+sumEle.get(sumEle.size()-1));
		
		//so firstly sort it and then add it
		Collections.sort(arr);
		long min = 0L;
		long max = 0L;
		for(int i=0,j=arr.size()-1; i< arr.size()-1 && j>0;i++,j--) {
			min+=arr.get(i);
			max+=arr.get(j);
		}
		
		System.out.println(min+" "+max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		minMax(arr);

	}

}
