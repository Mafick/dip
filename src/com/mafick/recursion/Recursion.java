package com.mafick.recursion;

public class Recursion {


	// iterative way
	public Integer result(int input) {
		int result = 0;
		for (int i = 1; i <= input; i++) {
			result = result + i;
		}


		return result;
	}

	// recursion way
	public Integer result_2(int k) {
		if (k > 0) {
			return k + result_2(k - 1);
		} else {
			return 0;
		}

	}

	/**
	 * dog 5
	 * <p>
	 * dddddoooooggggg
	 */

	// recursion way
	public String result_3(String input, int counter, int idx) {

		String result = "";
		if (idx + 1 > input.length()) {
			return result;
		} else {
			result = result + repeatChar(input.charAt(idx), counter);
			return result + result_3(input, counter, idx + 1);
		}

	}

	private String repeatChar(char s, int times) {
		String repeatedChar = "";
		for (int i = 0; i < times; i++) {
			repeatedChar = repeatedChar + s;
		}
		return repeatedChar;
	}

}
