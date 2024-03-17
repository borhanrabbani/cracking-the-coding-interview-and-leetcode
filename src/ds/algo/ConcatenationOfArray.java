// https://leetcode.com/problems/concatenation-of-array/description/
// 1929. Concatenation Of Array

package ds.algo;

import java.util.Arrays;

public class ConcatenationOfArray {

	public static int[] getConcatenation(int[] nums) {
		int[] result = Arrays.copyOf(nums, 2 * nums.length);
		System.arraycopy(nums, 0, result, nums.length, nums.length);
		return result;
	}
	
	public static int[] getConcatenationUsingLoop(int[] nums) {
		int[] result = new int[nums.length*2];
		for(int i=0; i<nums.length; i++) {
			result[i]=nums[i];
			result[i+nums.length]=nums[i];
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 1 };
		System.out.println(Arrays.toString(getConcatenation(nums)));
		System.out.println(Arrays.toString(getConcatenationUsingLoop(nums)));
	}

}
