package com.mafick.array;

public class LongestIncreasingSubsequnce {

	public Integer result(int[] input) {

		int result = lengthofLIS(input, Integer.MIN_VALUE, 0);

		return result;
	}

	public int lengthofLIS(int[] nums, int prev, int curpos) {
		if (curpos == nums.length) {
			return 0;
		}
		int taken = 0;
		if (nums[curpos] > prev) {
			taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
		}
		int nottaken = lengthofLIS(nums, prev, curpos + 1);
		return Math.max(taken, nottaken);
	}
}
