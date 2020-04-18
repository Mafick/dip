package com.mafick.list;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {


	public List<Integer> result_interative(List<Integer> input) {
		List<Integer> result = new LinkedList<>();

		for (int i = input.size() - 1; i >= 0; i--) {
			result.add(input.get(i));
		}

		return result;
	}

	public List<Integer> result_recursive(List<Integer> input) {
		List<Integer> result = new LinkedList<>();

		for (int i = input.size() - 1; i >= 0; i--) {
			result.add(input.get(i));
		}

		return result;
	}
}
