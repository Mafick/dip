package com.mafick.string;

public class CompressedStringTestData {

	/**
	 * The input
	 * 3[abc]4[ab]c
	 *
	 * Would be output as
	 * abcabcabcababababc
	 * abcabcabcababababc
	 *
	 * 2[3[ab]4[3[c]ab]]
	 *
	 */

	public static String createTestData_1() {
		String testData = "1[a]4[b]cdf";
		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String createTestData_2() {
		String testData = "2[3[a]b]";
		System.out.println("Input:     " + testData);
		return testData;
	}
}
