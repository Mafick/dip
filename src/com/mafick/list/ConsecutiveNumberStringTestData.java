package com.mafick.list;

import java.util.LinkedList;

public class ConsecutiveNumberStringTestData {

	/**
	 * Hi, here's your problem today.
	 * This problem was recently asked by Facebook:
	 * <p>
	 * Given a sorted list of numbers,
	 * return a list of strings that
	 * represent all of the consecutive numbers.
	 * <p>
	 * Example:
	 * Input: [0, 1, 2, 5, 7, 8, 9, 9, 10, 11, 15]
	 * Output: ['0->2', '5->5', '7->11', '15->15']
	 * Assume that all numbers will be greater than
	 * or equal to 0, and each element can repeat.
	 * <p>
	 * Explanation:
	 * 0,1,2
	 * 5
	 * 7,8,9,10,11
	 * 15
	 */

	public static LinkedList<Integer> creteTestData_1() {
		LinkedList<Integer> testData = new LinkedList<>();

		testData.add(0);
		testData.add(1);
		testData.add(2);
		testData.add(5);
		testData.add(7);
		testData.add(8);
		testData.add(9);
		testData.add(9);
		testData.add(10);
		testData.add(11);
		testData.add(15);


		System.out.println(testData);
		return testData;
	}
}
