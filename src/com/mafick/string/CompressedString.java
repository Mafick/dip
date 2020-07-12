package com.mafick.string;

public class CompressedString {

	public String result(String input) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			recursive(input, i);
		}

		return result.toString();
	}

	private String recursive(String input, int i) {
		char currentChar = input.charAt(i);

		if (currentChar == '[') {
			String recursive = recursive(input.substring(i + 1), 0);
			// System.out.println(recursive);
		}

		StringBuilder subString = new StringBuilder();
		for (int j = 0; j < input.length(); j++) {
			subString.append(input.charAt(j));
			// System.out.println(subString.toString());
			if (currentChar == ']') {
				break;
			}
		}

		return subString.toString();
	}

	//

	private String createSubResultString(String counterString, String alphabeticString) {
		StringBuilder subResultString = new StringBuilder();
		int counter = Integer.parseInt(counterString);
		for (int i = 0; i < counter; i++) {
			subResultString.append(alphabeticString);
		}

		return subResultString.toString();
	}

	private String getAlphabeticString(String input, int i) {
		StringBuilder alphabeticStringBuilder = new StringBuilder();
		for (int j = i; j < input.length(); j++) {
			if (Character.isAlphabetic(input.charAt(j))) {
				alphabeticStringBuilder.append(input.charAt(j));
			} else {
				break;
			}

		}
		return alphabeticStringBuilder.toString();
	}

	private String getCounterString(String input, int i) {
		StringBuilder counterStringBuilder = new StringBuilder();
		for (int j = i; j < input.length(); j++) {
			if (Character.isDigit(input.charAt(j))) {
				counterStringBuilder.append(input.charAt(j));
			} else {
				break;
			}
		}
		return counterStringBuilder.toString();

	}

	class Node {
		int repeat;
		String value;
		Node nextNode;

		public Node(int repeat, String value, Node nextNode) {
			this.repeat = repeat;
			this.value = value;
			this.nextNode = nextNode;
		}

		@Override
		public String toString() {
			return "Node{" +
					"repeat=" + repeat +
					", value='" + value + '\'' +
					", nextNode=" + nextNode +
					'}';
		}
	}
}
