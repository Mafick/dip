package com.mafick.substring;

public class FindLongestSubString {

	public Integer result(String s) {
		int current = 1;
		int result = 0;

		for (int i = 1; i < s.length(); i++) {

			char currentChar = s.charAt(i - 1);
			char nextChar = s.charAt(i);

			if (currentChar != nextChar) {
				if (result < current) {
					result = current;
				}
				current = 1;
			} else {
				current++;
			}

		}

		return result;
	}

}
