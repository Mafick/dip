package com.mafick.array;

import java.util.Arrays;

public class FindMissingNumbersTestData {


	/**
	 * Given an array of integers of size n,
	 * where all elements are between 1 and n inclusive,
	 * find all of the elements of [1, n] that do not appear in the array.
	 * Some numbers may appear more than once.
	 * <p>
	 * Example:
	 * Input: [4,5,2,6,8,2,1,5]
	 * Output: [3,7]
	 */

	public static Integer[] creteTestData_1() {
		Integer[] testData = {4, 5, 2, 6, 8, 2, 1, 5};

		System.out.println("Input:     " + Arrays.toString(testData));
		return testData;
	}

	public static Integer[] creteTestData_2() {
		Integer[] testData = {1, 7, 8, 11};

		System.out.println("Input:     " + Arrays.toString(testData));
		return testData;
	}
}
