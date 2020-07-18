package com.mafick.string;

public class AbsolutePathTestData {

	/**
	 * Given a file path with folder names, '..' (Parent directory),
	 * and '.' (Current directory), return the shortest possible
	 * file path (Eliminate all the '..' and '.').
	 * <p>
	 * Input: '/Users/Joma/Documents/../Desktop/./../'
	 * Output: '/Users/Joma/'
	 */


	public static String creteTestData_1() {
		String testData = "/Users/Joma/Documents/../Desktop/./../";

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String creteTestData_2() {
		String testData = "/a/./b/../../c/";

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static String creteTestData_3() {
		String testData = "/a//b////c/d//././/..";

		System.out.println("Input:     " + testData);
		return testData;
	}

}
