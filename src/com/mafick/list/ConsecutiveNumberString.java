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
			System.out.println(start);

			end = input.get(i);
			for (int j = 0; j < input.size(); j++) {
				System.out.println(end);
				if (end + 1 == input.get(j)) {
					end = input.get(j);
				} else {
					result.add(String.format("%s->%s", start, end));
				}

			}
		}

		return result;
	}

}
