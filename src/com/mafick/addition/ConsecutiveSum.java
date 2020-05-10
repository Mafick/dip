package com.mafick.addition;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConsecutiveSum {

	public List<Integer> result(List<Integer> input, int target) {

		Set<Integer> removeSet = new HashSet<>();
		for (int i = 0; i < input.size(); i++) {
			int tmpResult = input.get(i);
			for (int j = i + 1; j < input.size(); j++) {
				Integer nextNumber = input.get(j);
				tmpResult = tmpResult + nextNumber;
				if (tmpResult == target) {
					int removeIndex = i;
					while (removeIndex <= j) {
						removeSet.add(input.get(removeIndex));
						removeIndex++;
					}
					break;
				}
			}
		}
		input.removeAll(removeSet);
		return input;
	}
}
