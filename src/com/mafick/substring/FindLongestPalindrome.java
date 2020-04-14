package com.mafick.substring;

public class FindLongestPalindrome {

	public String result(String str) {
		String result = "";

		if (str.length() == 1) {
			return str;
		}

		int maxLength = 1;
		int start = 0;
		int len = str.length();
		int low, high;

		for (int i = 1; i < str.length() - 1; i++) {

			String currentResult = "";
			// Find the longest even length palindrome with
			// center points as i-1 and i.
			low = i - 1;
			high = i;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
				currentResult = getString(str, start, start + maxLength - 1);
			}

			// Find the longest odd length palindrome with
			// center point as i
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
				currentResult = getString(str, start, start + maxLength - 1);
			}

			if (currentResult.length() > result.length()) {
				result = currentResult;
			}

		}

		return result;
	}

	// A utility function to print a substring str[low..high]
	static String getString(String str, int low, int high) {
		return str.substring(low, high + 1);
	}
}
