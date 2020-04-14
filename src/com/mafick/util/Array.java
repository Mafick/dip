package com.mafick.util;

import java.util.ArrayList;

public class Array {

	public static ArrayList<Integer> createIntegerArrayList(int... integers) {
		ArrayList<Integer> resultArray = new ArrayList<>();
		for (int i : integers) {
			resultArray.add(i);
		}
		return resultArray;
	}


}
