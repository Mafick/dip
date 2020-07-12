package com.mafick.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumbers {

	public Integer[] result(Integer[] input) {
		List<Integer> resultList = new ArrayList<>();

		List<Integer> sortedFilteredInput = Arrays.stream(input)
				.distinct()
				.sorted()
				.collect(Collectors.toList());

		int counter = 1;
		for (int value : sortedFilteredInput) {
			for (int i = counter; i < value; i++) {
				resultList.add(i);
			}
			counter = value + 1;
		}

		Integer[] intArray = new Integer[resultList.size()];
		intArray = resultList.toArray(intArray);

		return intArray;
	}

}
