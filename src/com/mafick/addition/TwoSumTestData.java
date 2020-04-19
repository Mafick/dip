package com.mafick.addition;

import java.util.LinkedList;
import java.util.List;

public class TwoSumTestData {

	/**
	 * Given [4, 7, 1 , -3, 2] and k = 5,
	 * return true since 4 + 1 = 5.
	 */

	public static List<Integer> creteTestData_1() {
		List<Integer> testData = new LinkedList<>();

		testData.add(4);
		testData.add(7);
		testData.add(1);
		testData.add(-3);
		testData.add(2);

		System.out.println("Input:     " + testData + " Target=5");
		return testData;
	}

	public static List<Integer> creteTestData_2() {
		List<Integer> testData = new LinkedList<>();

		testData.add(3);
		testData.add(7);
		testData.add(2);
		testData.add(-3);
		testData.add(2);

		System.out.println("Input:     " + testData + " Target=6");
		return testData;
	}
}
