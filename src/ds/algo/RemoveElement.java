package ds.algo;

import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int idx=0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]!=val) {
				nums[idx]=nums[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(nums));
		
		return idx;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr,2));
	}

}
