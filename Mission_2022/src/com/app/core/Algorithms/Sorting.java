package com.app.core.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	
	public static int[] getIntegers(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            //or
            /* 
             * Random random = new Random();
             * arr[i] = random.nextInt(1000); 1000 => upper bound.
             *  
             * 
             */
        }
        return arr;
    }
    
	public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println("ELement "+ i + " contents " + arr[i]);
        }
    }
    
	public static int[] sortIntegers(int[] arr){
	    int[] sortedIntegersInDesc = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int j = 0;
        for(int i = arr.length-1; i>= 0;i--){
            
            sortedIntegersInDesc[j] = arr[i];
            ++j;
        }
        return sortedIntegersInDesc;
    } 
    public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[arr.length];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		
		System.out.println(arr==arr1);// compare the references of both the arrays
		System.out.println(arr.equals(arr1));// compare the references of both the arrays
		System.out.println(Arrays.equals(arr, arr1));//check arrays content 
		
		arr = sortIntegers(arr);
		printArray(arr);
	}
}

//public class Sorting {
//	
//	//selection sorting
//	static int[] selectionSortArray(int[] arr) {
//		for(int i = 0; i<arr.length-1;i++) {
//			int min_index = i;
//			for(int j = i+1;j<arr.length;j++) {
//				if(arr[min_index]>arr[j]) {
//					min_index = j;
//				}
//			}
//			int temp = arr[min_index];
//			arr[min_index] = arr[i];
//			arr[i] = temp;
//		}
//		return arr;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = new int[] {106,26,81,5,15};
//		//cannot define in this way int[] arr = new int[5]{106,26,81,5,15};
//		// because Cannot define dimension expressions when an array initializer is provided
//		arr = selectionSortArray(arr);
//		for(int val : arr) {
//			System.out.println(val);
//		}
//
//	}
//
//}
