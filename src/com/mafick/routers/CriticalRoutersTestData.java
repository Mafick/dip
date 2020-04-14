package com.mafick.routers;

import java.util.ArrayList;

import com.mafick.util.Array;

public class CriticalRoutersTestData {

	public static ArrayList<ArrayList<Integer>> creteTestData_1() {
		ArrayList<ArrayList<Integer>> testData = new ArrayList<>();

		ArrayList<Integer> arrayList1 = Array.createIntegerArrayList(1, 2);
		ArrayList<Integer> arrayList2 = Array.createIntegerArrayList(2, 3);
		ArrayList<Integer> arrayList3 = Array.createIntegerArrayList(3, 4);
		ArrayList<Integer> arrayList4 = Array.createIntegerArrayList(4, 5);
		ArrayList<Integer> arrayList5 = Array.createIntegerArrayList(3, 6);

		testData.add(arrayList1);
		testData.add(arrayList2);
		testData.add(arrayList3);
		testData.add(arrayList4);
		testData.add(arrayList5);

		System.out.println("Input:     " + testData);
		return testData;
	}

	public static ArrayList<ArrayList<Integer>> creteTestData_2() {
		ArrayList<ArrayList<Integer>> testData = new ArrayList<>();

		ArrayList<Integer> arrayList1 = Array.createIntegerArrayList(1, 2);
		ArrayList<Integer> arrayList2 = Array.createIntegerArrayList(2, 3);
		ArrayList<Integer> arrayList3 = Array.createIntegerArrayList(3, 4);
		ArrayList<Integer> arrayList4 = Array.createIntegerArrayList(4, 5);
		ArrayList<Integer> arrayList5 = Array.createIntegerArrayList(3, 6);
		ArrayList<Integer> arrayList6 = Array.createIntegerArrayList(4, 7);
		ArrayList<Integer> arrayList7 = Array.createIntegerArrayList(5, 2);

		testData.add(arrayList1);
		testData.add(arrayList2);
		testData.add(arrayList3);
		testData.add(arrayList4);
		testData.add(arrayList5);
		testData.add(arrayList6);
		testData.add(arrayList7);

		System.out.println("Input:     " + testData);
		return testData;
	}


}
