package com.mafick.exception;

import java.util.List;

public class LoopBreaking {


	public void result(List<Integer> input) {

		for (int element : input) {
			if (element > 5) {
				throw new RuntimeException("ist größer als 5");
			} else {
				System.out.println(element);
			}
		}

	}
}
