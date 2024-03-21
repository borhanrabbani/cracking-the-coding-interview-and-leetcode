package ds.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		
		// brute force solution, takes n^2 time.

		int[] res = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}

	public static int[] twoSum2(int[] nums, int target) {
		
		// feasible solution, takes O(n) time.

		Map<Integer, Integer> numMap = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int complement = target-nums[i];
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement),i};
			}
			numMap.put(nums[i], i);
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

}
