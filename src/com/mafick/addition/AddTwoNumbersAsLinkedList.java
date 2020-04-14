package com.mafick.addition;

import java.util.LinkedList;

public class AddTwoNumbersAsLinkedList {

	public Integer result(LinkedList<Integer> list_1, LinkedList<Integer> list_2) {

		String number_1_string = getReverseStringFromList(list_1);
		String number_2_string = getReverseStringFromList(list_2);
		Integer number_1 = Integer.valueOf(number_1_string);
		Integer number_2 = Integer.valueOf(number_2_string);

		return number_1 + number_2;
	}

	//

	private String getReverseStringFromList(LinkedList<Integer> list_1) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = list_1.size() - 1; i >= 0; i--) {
			stringBuilder.append(list_1.get(i));
		}
		return stringBuilder.toString();
	}
}
