package com.mafick;

import java.util.ArrayList;
import java.util.List;

import com.mafick.addition.AddTwoNumbersAsLinkedList;
import com.mafick.addition.AddTwoNumbersAsLinkedListTestData;
import com.mafick.addition.TwoSum;
import com.mafick.addition.TwoSumTestData;
import com.mafick.array.FirstAndLastIndicies;
import com.mafick.array.FirstAndLastIndiciesTestData;
import com.mafick.list.ReverseList;
import com.mafick.list.ReverseListTestData;
import com.mafick.routers.CriticalRouters;
import com.mafick.routers.CriticalRoutersTestData;
import com.mafick.string.ValidateBalancedBrackets;
import com.mafick.string.ValidateBalancedBracketsTestData;
import com.mafick.substring.FindLongestPalindrome;
import com.mafick.substring.FindLongestPalindromeTestData;
import com.mafick.substring.FindLongestSubString;
import com.mafick.substring.FindLongestSubStringTestData;

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

	//

	private static void printResult(Object result) {
		System.out.println("Output:    " + result);
	}
}
