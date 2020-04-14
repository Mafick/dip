package com.mafick.addition;

import java.util.LinkedList;

public class AddTwoNumbersAsLinkedListTestData {

	/**
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * Output: 7 -> 0 -> 8
	 * Explanation: 342 + 465 = 807.
	 */

	public static LinkedList<Integer> creteTestData_1() {
		LinkedList<Integer> testData = new LinkedList<>();

		testData.add(2);
		testData.add(4);
		testData.add(3);

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static LinkedList<Integer> creteTestData_2() {
		LinkedList<Integer> testData = new LinkedList<>();

		testData.add(5);
		testData.add(6);
		testData.add(4);

		System.out.println("Input:     " + testData);
		return testData;
	}

}
