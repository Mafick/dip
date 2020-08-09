package com.mafick.array;

public class MiddleOfGrid {


	public boolean result(int[][] input) {

		int length = input.length;
		int heart = 0;
		int max = 0;
		int half = length / 2;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				int x = input[i][j];


				if (i == half && j == half) {
					heart = x;
				}

				if (i == length - 1 || j == length - 1) {
					if (max < x) {
						max = x;
					}
				}

			}
		}

		boolean result;
		result = heart == max;

		return result;
	}


}
