package com.mafick.string;

public class ValidateBalancedBrackets {

	public boolean result(String str) {

		int counter = 1;
		StringBuilder expectedOutput = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if ('(' == (str.charAt(i))) {
				expectedOutput.append(')');
			}
			if ('{' == (str.charAt(i))) {
				expectedOutput.append('}');
			}
			if ('[' == (str.charAt(i))) {
				expectedOutput.append(']');
			}

			if (str.substring(i).contains(expectedOutput.toString())) {
				counter = 1;
				expectedOutput = new StringBuilder();
			} else {
				counter++;
			}
		}

		return counter == 1;
	}
}
