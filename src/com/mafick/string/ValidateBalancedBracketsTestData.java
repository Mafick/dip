package com.mafick.string;

public class ValidateBalancedBracketsTestData {

	/**
	 * Input: "((()))"
	 * Output: True
	 * <p>
	 * Input: "[()]{}"
	 * Output: True
	 * <p>
	 * Input: "({[)]"
	 * Output: False
	 */

	public static String creteTestData_1() {
		String testData = "((()))";

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String creteTestData_2() {
		String testData = "[()]{}";

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String creteTestData_3() {
		String testData = "({[)]";

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String creteTestData_4() {
		String testData = "[{]}";

		System.out.println("Input:     " + testData);
		return testData;
	}
}
