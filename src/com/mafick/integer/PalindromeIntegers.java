package com.mafick.integer;

import java.util.ArrayList;
import java.util.List;

public class PalindromeIntegers {

	public boolean result(Integer number) {
		List<Integer> integerList = new ArrayList<>();

		int tmp;
		while (number > 0) {
			tmp = number % 10;
			integerList.add(tmp);
			number /= 10;
		}

		int end = integerList.size() - 1;
		for (int i = 0; i <= end; i++) {
			if (!integerList.get(i).equals(integerList.get(end))) {
				return false;
			}
			end -= 1;
		}
		return true;
	}
}
