package com.mafick.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayProduct {

	public List<Integer> result(List<Integer> input) {

		List<Integer> toProduct = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < input.size(); i++) {
			toProduct.clear();
			for (int j = 0; j < input.size(); j++) {
				if (j != i) {
					toProduct.add(input.get(j));
					// 2,3,4,5 = toProduct
				}
			}
			result.add(toProduct.stream().reduce(1, (o, n) -> o * n));
		}
		return result;
	}
}


