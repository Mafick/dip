package com.mafick.array;

import java.util.ArrayList;

public class FindNonDuplicate {

	public Integer result(ArrayList<Integer> input) {
		Integer result = -1;

		for (int i = 0; i < input.size(); i++) {
			int j;
			for (j = 0; j < input.size(); j++) {
				if (i != j && input.get(i).equals(input.get(j))) {
					break;
				}
			}

			if (j == input.size()) {
				return input.get(i);
			}
		}

		return result;
	}


}
