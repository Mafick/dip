package com.mafick.array;

import java.util.ArrayList;

import com.mafick.util.Array;

public class FirstAndLastIndiciesTestData {

	/**
	 * Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
	 * Output: [6,8]
	 * <p>
	 * Input: A = [100, 150, 150, 153], target = 150
	 * Output: [1,2]
	 * <p>
	 * Input: A = [1,2,3,4,5,6,10], target = 9
	 * Output: [-1, -1]
	 */

	public static ArrayList<Integer> creteTestData_1() {
		ArrayList<Integer> testData = Array.createIntegerArrayList(1, 3, 3, 5, 7, 8, 9, 9, 9, 15);
		System.out.println(testData);
		return testData;
	}

	public static ArrayList<Integer> creteTestData_2() {
		ArrayList<Integer> testData = Array.createIntegerArrayList(100, 150, 150, 153);
		System.out.println(testData);
		return testData;
	}

	public static ArrayList<Integer> creteTestData_3() {
		ArrayList<Integer> testData = Array.createIntegerArrayList(1, 2, 3, 4, 5, 6, 10);
		System.out.println(testData);
		return testData;
	}
}
