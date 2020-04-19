package com.mafick.addition;

import java.util.List;

public class TwoSum {

	public boolean result(List<Integer> input, int target) {

		for (int i = 0; i < input.size(); i++) {
			for (int j = i + 1; j < input.size() - 1; j++) {
				if (input.get(i) + input.get(j) == target) {
					return true;
				}
			}
		}

		return false;
	}
}
