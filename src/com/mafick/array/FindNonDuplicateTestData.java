package com.mafick.array;

import java.util.ArrayList;

import com.mafick.util.Array;

public class FindNonDuplicateTestData {

	/**
	 * Input: [4, 3, 2, 4, 1, 3, 2]
	 * Output: 1
	 */

	public static ArrayList<Integer> creteTestData_1() {
		ArrayList<Integer> testData = Array.createIntegerArrayList(4, 3, 2, 2, 1, 3, 4);
		System.out.println(testData);
		return testData;
	}
}
