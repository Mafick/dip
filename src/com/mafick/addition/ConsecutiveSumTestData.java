package com.mafick.addition;

import java.util.LinkedList;
import java.util.List;

public class ConsecutiveSumTestData {

	/**
	 * Input: 10 -> 5 -> -3 -> -3 -> 1 -> 4 -> -4
	 * Output: 10
	 */

	public static List<Integer> creteTestData_1() {
		List<Integer> testData = new LinkedList<>();

		testData.add(10);
		testData.add(5);
		testData.add(-3);
		testData.add(-3);
		testData.add(1);
		testData.add(333);
		testData.add(4);
		testData.add(-4);
		testData.add(4);
		testData.add(6);
		testData.add(-10);
		testData.add(665);


		System.out.println("Input:     " + testData + " Target=0");
		return testData;
	}
}
