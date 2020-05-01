package com.mafick.string;

public class BasicCalculatorTestData {
	/**
	 * Input: - ( 3 + ( 2 - 1 ) )
	 * Output: -4
	 */

	public static String creteTestData_1() {
		String testData = " (2 + ( 3 + ( 2 - 6 ) ))";

		System.out.println("Input:     " + testData);
		return testData;
	}
}
