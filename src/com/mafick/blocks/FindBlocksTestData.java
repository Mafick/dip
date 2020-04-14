package com.mafick.blocks;

import java.util.ArrayList;

import com.mafick.util.Array;

public class FindBlocksTestData {

	public static ArrayList<ArrayList<Integer>> creteTestData() {
		ArrayList<ArrayList<Integer>> testData = new ArrayList<>();

		ArrayList<Integer> arrayList1 = Array.createIntegerArrayList(1, 0, 0, 0, 0);
		ArrayList<Integer> arrayList2 = Array.createIntegerArrayList(0, 1, 0, 0, 0);
		ArrayList<Integer> arrayList3 = Array.createIntegerArrayList(0, 0, 1, 0, 0);
		ArrayList<Integer> arrayList4 = Array.createIntegerArrayList(0, 0, 0, 1, 0);
		ArrayList<Integer> arrayList5 = Array.createIntegerArrayList(0, 0, 0, 0, 1);

		testData.add(arrayList1);
		testData.add(arrayList2);
		testData.add(arrayList3);
		testData.add(arrayList4);
		testData.add(arrayList5);

		return testData;
	}
}
