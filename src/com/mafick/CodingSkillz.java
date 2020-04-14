package com.mafick;

import java.util.List;

import com.mafick.addition.AddTwoNumbersAsLinkedList;
import com.mafick.addition.AddTwoNumbersAsLinkedListTestData;
import com.mafick.routers.CriticalRouters;
import com.mafick.routers.CriticalRoutersTestData;
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
		System.out.println("- FindLongestSubString");
		FindLongestSubString findLongestSubString = new FindLongestSubString();
		Integer result = findLongestSubString.result(FindLongestSubStringTestData.creteTestData_1());
		printResult(result);
	}

	//

	private static void printResult(Object result) {
		System.out.println("Output:    " + result);
	}
}
