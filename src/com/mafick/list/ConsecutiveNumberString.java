package com.mafick.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConsecutiveNumberString {

	public List<String> result(LinkedList<Integer> input) {
		List<String> result = new ArrayList<>();

		int start;
		int end;
		for (int i = 0; i < input.size(); i++) {
			start = input.get(i);

			end = input.get(i);
			for (int j = i + 1; j < input.size(); j++) {
				int currentEnd = input.get(j);

				if (currentEnd - 1 == input.get(j - 1) || currentEnd == input.get(j - 1)) {
					end = currentEnd;
				} else {
					break;
				}

				i = j;
			}

			result.add(String.format("%s->%s", start, end));
		}

		return result;
	}

}
