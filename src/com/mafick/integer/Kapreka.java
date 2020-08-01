package com.mafick.integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kapreka {

	private static final int KAPREKAR_CONSTANT = 6174;

	public int result(Integer number) {
		int result = 0;

		while (number != KAPREKAR_CONSTANT) {
			int ascNumber = sortNumber(number, "ASC");
			int descNumber = sortNumber(number, "DESC");

			descNumber = paddingZeros(descNumber);

			number = descNumber - ascNumber;
			result++;
		}

		return result;
	}

	//

	private int paddingZeros(int descNumber) {
		while (descNumber < 1000) {
			descNumber = descNumber * 10;
		}
		return descNumber;
	}

	private int sortNumber(Integer number, String order) {
		List<Integer> integerList = new ArrayList<>();
		int tmp;
		while (number > 0) {
			tmp = number % 10;
			integerList.add(tmp);
			number /= 10;
		}
		List<Integer> orderedList = integerList.stream().sorted().collect(Collectors.toList());

		if ("DESC".equals(order)) {
			Collections.reverse(orderedList);
		}

		int result = 0;
		for (int entry : orderedList) {
			result = (result * 10) + entry;
		}

		return result;
	}
}
