package com.mafick.list;

import java.util.LinkedList;
import java.util.List;

public class ReverseListTestData {

	/**
	 * Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
	 * Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
	 */

	public static List<Integer> creteTestData_1() {
		List<Integer> testData = new LinkedList<>();
		testData.add(4);
		testData.add(3);
		testData.add(2);
		testData.add(1);
		testData.add(0);

		System.out.println("Input:     " + testData);
		return testData;
	}
}
