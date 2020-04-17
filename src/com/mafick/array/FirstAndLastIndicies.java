package com.mafick.array;

import java.util.ArrayList;

public class FirstAndLastIndicies {

	public ArrayList<Integer> result(ArrayList<Integer> input, Integer search) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(0);

		boolean foundFirst = false;

		for (int i = 0; i < input.size(); i++) {
			Integer currentNumber = input.get(i);
			if (currentNumber.equals(search)) {

				if (!foundFirst) {
					result.set(0, i);
					foundFirst = true;
				}

				if (result.get(1) < currentNumber) {
					result.set(1, i);
				}
			}
		}

		if (result.get(0).equals(0) && result.get(1).equals(0)) {
			result.set(0, -1);
			result.set(1, -1);
		}

		return result;
	}

}
