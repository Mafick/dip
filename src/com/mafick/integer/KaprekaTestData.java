package com.mafick.integer;

public class KaprekaTestData {

	/**
	 *
	 * KAPREKAR_CONSTANT = 6174
	 *
	 * This certain function is as follows:
	 * - Order the number in ascending form and descending form to create 2 numbers.
	 * - Pad the descending number with zeros until it is 4 digits in length.
	 * - Subtract the ascending number from the descending number.
	 * - Repeat.
	 *
	 * print num_kaprekar_iterations(123)
	 * # 3
	 * # Explanation:
	 * #  3210 - 123 = 3087
	 * #  8730 - 0378 = 8352
	 * #  8532 - 2358 = 6174 (3 iterations)
	 *
	 */

	public static Integer creteTestData_1() {
		Integer testData = 666;

		System.out.println("Input:     " + testData);
		return testData;
	}
}
