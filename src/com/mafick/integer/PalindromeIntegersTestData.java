package com.mafick.integer;

public class PalindromeIntegersTestData {

	/**
	 * Given an integer, check if that integer is a palindrome.
	 * For this problem do not convert the integer to a string to check if it is a palindrome.
	 * <p>
	 * print is_palindrome(1234321)
	 * # True
	 * print is_palindrome(1234322)
	 * # False
	 */

	public static Integer creteTestData_1() {
		Integer testData = 1234321;

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static Integer creteTestData_2() {
		Integer testData = 1234322;

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static Integer creteTestData_3() {
		Integer testData = 99877899;

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static Integer creteTestData_4() {
		Integer testData = 1234544321;

		System.out.println("Input:     " + testData);
		return testData;
	}
}
