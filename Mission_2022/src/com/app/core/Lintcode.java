package com.app.core;

import java.util.*;

public class Lintcode {
	    /**
	     * @param weights: An array of n integers, where the value of each element weights[i] is the weight of each plate i
	     * @param maxCapacity: An integer, the capacity of the barbell
	     * @return: an integer denoting the maximum capacity of items that she can lift.
	     */
	    public static int weightCapacity(int[] weights, int maxCapacity) {
	        // Write your code here
	    	int counter =0;
	        List<Integer> arr = new ArrayList<>();
	        for (int i=0; i< weights.length;i++){
	            for(int j=i+1;j<weights.length;j++){
	            	while(counter<=maxCapacity) {
		        		counter=weights[i]+weights[j];
		        	}
//	            	if(weights[i]+weights[j]<=maxCapacity){
	                   arr.add(counter);
//	                }
	            }
	        	
	        	
	        }

	        return Collections.max(arr);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,4,5,8,9};
		System.out.println(weightCapacity(arr, 20));
	}

}
