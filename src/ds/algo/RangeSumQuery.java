// https://leetcode.com/problems/range-sum-query-immutable/description/

package ds.algo;

public class RangeSumQuery {
	
	int[] sums;

	public RangeSumQuery(int[] nums) {
        sums = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
        	sums[i+1] = sums[i]+nums[i];
        }
    }

	public int sumRange(int left, int right) {
		return sums[right+1]-sums[left];
	}

	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery numArray = new RangeSumQuery(nums);
        System.out.println(numArray.sumRange(0, 2)); 
        System.out.println(numArray.sumRange(2, 5)); 
        System.out.println(numArray.sumRange(0, 5)); 
	}

}
