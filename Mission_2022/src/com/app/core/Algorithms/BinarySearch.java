package com.app.core.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int first,int last,int searchItem) {
		//int[] arr = {0,0,0,0,0,1,1};
		int mid = 0;
		while(first<last) {
			mid = (first+last)/2;
			if(arr[mid] < searchItem) {
				first = mid+1;
			}
			else {
				last=mid;
			}
		}
		
		return first;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0,1}; //sorted array
		Arrays.sort(arr);
		int indexFound = binarySearch(arr, 0, arr.length-1, 1);
		System.out.println("integer 1 is first found at: "+ indexFound);
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				j=i;
				break;
			}
		}
		System.out.println(j);
		
		
		String[] arr1 = {"0","1","2","3"};
		
		List<Integer> arr2 = new ArrayList<Integer>();
		
		for(String i: arr1) {
			System.out.println(arr2.add(Integer.parseInt(i)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
