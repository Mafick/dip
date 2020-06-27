package com.mafick.string;

public class CompressedString {

	public String result(String input) {
		StringBuilder result = new StringBuilder();

		//  Node(2 Node(3(Node(4, a, null)))

		String counterString = null;
		String alphabeticString = null;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			// System.out.println(currentChar);

			if (Character.isDigit(currentChar)) {
				counterString = getCounterString(input, i);
				// System.out.println(counterString);
				i += counterString.length();
			}

			if (Character.isAlphabetic(currentChar)) {
				alphabeticString = getAlphabeticString(input, i);
				// System.out.println(alphabeticString);
				i += alphabeticString.length();
			}

			if (alphabeticString != null) {

				if (counterString != null) {
					String subResultString = createSubResultString(counterString, alphabeticString);
					result.append(subResultString);
				} else {
					result.append(alphabeticString);
				}

				counterString = null;
				alphabeticString = null;
			}

		}

		return result.toString();
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
	}
}
