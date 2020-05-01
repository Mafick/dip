package com.mafick.string;

import java.util.Stack;

public class BasicCalculator {

	Stack<Character> stack = new Stack<>();

	public int result(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (currentChar != ' ') {
				stack.push(currentChar);
				if (currentChar == ')') {
					StringBuilder builder = new StringBuilder();
					while (!stack.isEmpty()) {
						Character pop = stack.pop();
						builder.append(pop);
						if (pop == '(') {
							break;
						}
					}
					String currentExpr = builder.reverse().toString();
					System.out.println(currentExpr);
					int interimResult = evaluateExpr(currentExpr);

					result += interimResult;
				}
			}
		}

		return result;
	}

	public int evaluateExpr(String expr) {
		int interimResult = 0;

		boolean wasMinus = false;
		for (int i = 0; i < expr.length(); i++) {
			char currentChar = expr.charAt(i);

			if (Character.isDigit(currentChar)) {

				int currentNumber = Integer.parseInt(String.valueOf(currentChar));
				if (wasMinus) {
					interimResult -= currentNumber;
					wasMinus = false;
				} else {
					interimResult += currentNumber;
				}
			}

			if (currentChar == '-') {
				wasMinus = true;
			}

		}

		return interimResult;
	}
}
