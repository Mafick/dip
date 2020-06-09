package com.mafick.array;

import java.util.LinkedList;

public class ArrayProductTestData {

/*
	For example, an input of [1, 2, 3, 4, 5]
	 should return [120, 60, 40, 30, 24].

	 Input: [1, 2, 3, 4, 5]
	 Output: [120, 60, 40, 30, 24]
	 Explanation: 2*3*4*5 = 120,
	               1*3*4*5 = 60,
	               1*2*4*5 = 40
*/


	public static LinkedList<Integer> creteTestData_1() {
		LinkedList<Integer> testData = new LinkedList<>();

		testData.add(1);
		testData.add(2);
		testData.add(3);
		testData.add(4);
		testData.add(5);

		System.out.println("Input:     " + testData);
		return testData;
	}

}
