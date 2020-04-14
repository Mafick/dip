package com.mafick.substring;

public class FindLongestPalindrome {

	public String result(String s) {
		String result = "";
		for (int i = 1; i < s.length() - 1; i++) {
			boolean isSame = true;
			StringBuilder builder = new StringBuilder();
			builder.append(s.charAt(i));

			for (int extender = 1; isSame; extender++) {
				isSame = s.charAt(i - extender) == s.charAt(i + extender);
				if (isSame) {
					builder.insert(0, s.charAt(i - extender));
					builder.insert(builder.toString().length(), s.charAt(i - extender));
				}

				if (i + extender >= s.length() - 1) {
					isSame = false;
				}
			}

			if (builder.toString().length() > result.length()) {
				result = builder.toString();
			}
		}

		return result;
	}
}
