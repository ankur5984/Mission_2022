package com.app.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		// Write your code here
		int j;
		int counter = 0;
		// rows
		for (int i = 0; i < n; i++) {
			// columns
			if (i != n - 1) {
				for (j = 0; j < n - 1; j++) {
					++counter;
					System.out.print(" ");
					if (counter == (n - i - 1)) {
						break;
					}
				}
			}
			for (j = counter; j < n; j++) {
				System.out.print("#");

			}

			counter = 0;

			System.out.println();
		}

	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.staircase(n);
		//  input --> 6
		//output below-->
		//      #
		//     ##
		//    ###
		//   ####
		//  #####
		// ######


		bufferedReader.close();
	}
}
