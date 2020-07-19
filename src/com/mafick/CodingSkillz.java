package com.mafick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mafick.addition.AddTwoNumbersAsLinkedList;
import com.mafick.addition.AddTwoNumbersAsLinkedListTestData;
import com.mafick.addition.ConsecutiveSum;
import com.mafick.addition.ConsecutiveSumTestData;
import com.mafick.addition.TwoSum;
import com.mafick.addition.TwoSumTestData;
import com.mafick.array.ArrayProduct;
import com.mafick.array.ArrayProductTestData;
import com.mafick.array.FindMissingNumbers;
import com.mafick.array.FindMissingNumbersTestData;
import com.mafick.array.FindNonDuplicate;
import com.mafick.array.FindNonDuplicateTestData;
import com.mafick.array.FirstAndLastIndicies;
import com.mafick.array.FirstAndLastIndiciesTestData;
import com.mafick.array.LongestIncreasingSubsequnce;
import com.mafick.array.LongestIncreasingSubsequnceTestData;
import com.mafick.list.ConsecutiveNumberString;
import com.mafick.list.ConsecutiveNumberStringTestData;
import com.mafick.list.ReverseList;
import com.mafick.list.ReverseListTestData;
import com.mafick.nodes.ReverseDirectGraph;
import com.mafick.nodes.ReverseDirectGraphTestData;
import com.mafick.recursion.Recursion;
import com.mafick.recursion.RecursionTestData;
import com.mafick.routers.CriticalRouters;
import com.mafick.routers.CriticalRoutersTestData;
import com.mafick.string.AbsolutePath;
import com.mafick.string.AbsolutePathTestData;
import com.mafick.string.BasicCalculator;
import com.mafick.string.BasicCalculatorTestData;
import com.mafick.string.CompareVersionNumber;
import com.mafick.string.CompareVersionNumberTestData;
import com.mafick.string.CompressedString;
import com.mafick.string.CompressedStringTestData;
import com.mafick.string.ValidateBalancedBrackets;
import com.mafick.string.ValidateBalancedBracketsTestData;
import com.mafick.substring.FindLongestPalindrome;
import com.mafick.substring.FindLongestPalindromeTestData;
import com.mafick.substring.FindLongestSubString;
import com.mafick.substring.FindLongestSubStringTestData;
import com.mafick.util.Node;

public class CodingSkillz {

	public static void main(String[] args) {

		System.out.println("#### Coding Skillz ####");
		System.out.println(" ");

		criticalRouters();
		System.out.println(" ");
		twoIntegerLists();
		System.out.println(" ");
		findLongestSubString();
		System.out.println(" ");
		findLongestPalindrome();
		System.out.println(" ");
		validateBalancedBrackets();
		System.out.println(" ");
		firstAndLastIndicies();
		System.out.println(" ");
		reverseList();
		System.out.println(" ");
		twoSum();
		System.out.println(" ");
		findNonDuplicate();
		System.out.println(" ");
		basicCalculator();
		System.out.println(" ");
		consecutiveSum();
		System.out.println(" ");
		arrayProduct();
		System.out.println(" ");
		consecutiveNumberString();
		System.out.println(" ");
		longestIncreasingSubsequnce();
		System.out.println(" ");
		compressedString();
		System.out.println(" ");
		findMissingNumbers();
		System.out.println(" ");
		absolutePath();
		System.out.println(" ");
		reverseDirectedGraph();
		System.out.println(" ");
		recursion();
		System.out.println(" ");
		compareVersionNumber();
		System.out.println(" ");
	}

	//

	private static void criticalRouters() {
		System.out.println("- CriticalRouters");
		CriticalRouters criticalRouters = new CriticalRouters();
		List<Integer> result_1 = criticalRouters.result(6, 5, CriticalRoutersTestData.creteTestData_1());
		printResult(result_1);
		List<Integer> result_2 = criticalRouters.result(7, 7, CriticalRoutersTestData.creteTestData_2());
		printResult(result_2);

	}

	private static void twoIntegerLists() {
		System.out.println("- Addition: TwoIntegerLists");
		AddTwoNumbersAsLinkedList addTwoNumbersAsLinkedList = new AddTwoNumbersAsLinkedList();
		Integer result = addTwoNumbersAsLinkedList.result(AddTwoNumbersAsLinkedListTestData.creteTestData_1(), AddTwoNumbersAsLinkedListTestData.creteTestData_2());
		printResult(result);
	}

	private static void findLongestSubString() {
		System.out.println("- Substring: FindLongestSubString");
		FindLongestSubString findLongestSubString = new FindLongestSubString();
		Integer result = findLongestSubString.result(FindLongestSubStringTestData.creteTestData_1());
		printResult(result);
	}

	private static void findLongestPalindrome() {
		System.out.println("- Substring: FindLongestPalindrome");
		FindLongestPalindrome findLongestPalindrome = new FindLongestPalindrome();
		String result_1 = findLongestPalindrome.result(FindLongestPalindromeTestData.creteTestData_1());
		printResult(result_1);
		String result_2 = findLongestPalindrome.result(FindLongestPalindromeTestData.creteTestData_2());
		printResult(result_2);
		String result_3 = findLongestPalindrome.result(FindLongestPalindromeTestData.creteTestData_3());
		printResult(result_3);
		String result_4 = findLongestPalindrome.result(FindLongestPalindromeTestData.creteTestData_4());
		printResult(result_4);
	}

	private static void validateBalancedBrackets() {
		System.out.println("- Substring: FindLongestPalindrome");
		ValidateBalancedBrackets validateBalancedBrackets = new ValidateBalancedBrackets();
		boolean result_1 = validateBalancedBrackets.result(ValidateBalancedBracketsTestData.creteTestData_1());
		printResult(result_1);
		boolean result_2 = validateBalancedBrackets.result(ValidateBalancedBracketsTestData.creteTestData_2());
		printResult(result_2);
		boolean result_3 = validateBalancedBrackets.result(ValidateBalancedBracketsTestData.creteTestData_3());
		printResult(result_3);
		boolean result_4 = validateBalancedBrackets.result(ValidateBalancedBracketsTestData.creteTestData_4());
		printResult(result_4);
	}

	private static void firstAndLastIndicies() {
		System.out.println("- Array: FirstAndLastIndicies");
		FirstAndLastIndicies findLongestSubString = new FirstAndLastIndicies();
		ArrayList<Integer> result_1 = findLongestSubString.result(FirstAndLastIndiciesTestData.creteTestData_1(), 9);
		printResult(result_1);
		ArrayList<Integer> result_2 = findLongestSubString.result(FirstAndLastIndiciesTestData.creteTestData_2(), 150);
		printResult(result_2);
		ArrayList<Integer> result_3 = findLongestSubString.result(FirstAndLastIndiciesTestData.creteTestData_3(), 9);
		printResult(result_3);
	}

	private static void reverseList() {
		System.out.println("- List: ReverseList");
		ReverseList reverseList = new ReverseList();
		List<Integer> result_1 = reverseList.result_interative(ReverseListTestData.creteTestData_1());
		printResult(result_1);
		List<Integer> result_2 = reverseList.result_recursive(ReverseListTestData.creteTestData_1());
		printResult(result_2);
	}

	private static void twoSum() {
		System.out.println("- Addition: TwoSum");
		TwoSum twoSum = new TwoSum();
		boolean result_1 = twoSum.result(TwoSumTestData.creteTestData_1(), 5);
		printResult(result_1);
		boolean result_2 = twoSum.result(TwoSumTestData.creteTestData_2(), 6);
		printResult(result_2);
	}

	private static void findNonDuplicate() {
		System.out.println("- Array: findNonDuplicate");
		FindNonDuplicate findNonDuplicate = new FindNonDuplicate();
		Integer result_1 = findNonDuplicate.result(FindNonDuplicateTestData.creteTestData_1());
		printResult(result_1);
	}

	private static void basicCalculator() {
		System.out.println("- String: basicCalculator");
		BasicCalculator basicCalculator = new BasicCalculator();
		Integer result_1 = basicCalculator.result(BasicCalculatorTestData.creteTestData_1());
		printResult(result_1);
	}

	private static void consecutiveSum() {
		System.out.println("- Addition: consecutiveSum");
		ConsecutiveSum consecutiveSum = new ConsecutiveSum();
		List<Integer> result_1 = consecutiveSum.result(ConsecutiveSumTestData.creteTestData_1(), 10);
		printResult(result_1);
	}

	private static void arrayProduct() {
		System.out.println("- Array: arrayProduct");
		ArrayProduct arrayProduct = new ArrayProduct();
		List<Integer> result_1 = arrayProduct.result(ArrayProductTestData.creteTestData_1());
		printResult(result_1);
	}

	private static void consecutiveNumberString() {
		System.out.println("- List: NumberRange");
		ConsecutiveNumberString consecutiveNumberString = new ConsecutiveNumberString();
		List<String> result_1 = consecutiveNumberString.result(ConsecutiveNumberStringTestData.creteTestData_1());
		printResult(result_1);
	}

	private static void longestIncreasingSubsequnce() {
		System.out.println("- Array: LongestIncreasingSubsequnce");
		LongestIncreasingSubsequnce longestIncreasingSubsequnce = new LongestIncreasingSubsequnce();
		Integer result_1 = longestIncreasingSubsequnce.result(LongestIncreasingSubsequnceTestData.creteTestData_1());
		printResult(result_1);
	}

	private static void compressedString() {
		System.out.println("- String: CompressedString");
		CompressedString compressedString = new CompressedString();
		String result_1 = compressedString.result(CompressedStringTestData.createTestData_1());
		printResult(result_1);
		String result_2 = compressedString.result(CompressedStringTestData.createTestData_2());
		printResult(result_2);
	}

	private static void findMissingNumbers() {
		System.out.println("- Array: findMissingNumbers");
		FindMissingNumbers findMissingNumbers = new FindMissingNumbers();
		Integer[] result_1 = findMissingNumbers.result(FindMissingNumbersTestData.creteTestData_1());
		printResult(Arrays.toString(result_1));
		Integer[] result_2 = findMissingNumbers.result(FindMissingNumbersTestData.creteTestData_2());
		printResult(Arrays.toString(result_2));
	}

	private static void absolutePath() {
		System.out.println("- String: absolutePath");
		AbsolutePath absolutePath = new AbsolutePath();
		String result_1 = absolutePath.result(AbsolutePathTestData.creteTestData_1());
		printResult(result_1);
		String result_2 = absolutePath.result(AbsolutePathTestData.creteTestData_2());
		printResult(result_2);
		String result_3 = absolutePath.result(AbsolutePathTestData.creteTestData_3());
		printResult(result_3);
	}

	private static void reverseDirectedGraph() {
		System.out.println("- Node: reverseDirectedGraph");
		ReverseDirectGraph reverseDirectGraph = new ReverseDirectGraph();
		Node[] result = reverseDirectGraph.result(ReverseDirectGraphTestData.creteTestData());
		printResult(Arrays.toString(result));
	}

	private static void recursion() {
		System.out.println("- Recursion: recursion");
		Recursion recursion = new Recursion();
		Integer result_1 = recursion.result_2(RecursionTestData.creteTestData_1());
		printResult(result_1);
		String result_2 = recursion.result_3(RecursionTestData.creteTestData_2(), 5, 0);
		printResult(result_2);
	}

	private static void compareVersionNumber() {
		System.out.println("- String: compareVersionNumber");
		CompareVersionNumber compareVersionNumber = new CompareVersionNumber();

		System.out.println("Input:     " + CompareVersionNumberTestData.VERSION_1_0_33 + " vs " + CompareVersionNumberTestData.VERSION_1_0_27);
		int result_1 = compareVersionNumber.result(CompareVersionNumberTestData.VERSION_1_0_33, CompareVersionNumberTestData.VERSION_1_0_27);
		printResult(result_1);
		System.out.println("Input:     " + CompareVersionNumberTestData.VERSION_1_0_27 + " vs " + CompareVersionNumberTestData.VERSION_1_0_33);
		int result_2 = compareVersionNumber.result(CompareVersionNumberTestData.VERSION_1_0_27, CompareVersionNumberTestData.VERSION_1_0_33);
		printResult(result_2);

		System.out.println("Input:     " + CompareVersionNumberTestData.VERSION_1_0 + " vs " + CompareVersionNumberTestData.VERSION_1_0_0);
		int result_3 = compareVersionNumber.result(CompareVersionNumberTestData.VERSION_1_0, CompareVersionNumberTestData.VERSION_1_0_0);
		printResult(result_3);
		System.out.println("Input:     " + CompareVersionNumberTestData.VERSION_1_0_0 + " vs " + CompareVersionNumberTestData.VERSION_1_0);
		int result_4 = compareVersionNumber.result(CompareVersionNumberTestData.VERSION_1_0_0, CompareVersionNumberTestData.VERSION_1_0);
		printResult(result_4);

		System.out.println("Input:     " + CompareVersionNumberTestData.VERSION_1_001 + " vs " + CompareVersionNumberTestData.VERSION_1_0001);
		int result_5 = compareVersionNumber.result(CompareVersionNumberTestData.VERSION_1_001, CompareVersionNumberTestData.VERSION_1_0001);
		printResult(result_5);
	}


	//

	private static void printResult(Object result) {
		System.out.println("Output:    " + result);
	}
}
