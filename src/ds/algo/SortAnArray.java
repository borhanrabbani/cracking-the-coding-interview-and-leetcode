package ds.algo;

import java.util.Arrays;

public class SortAnArray {

	public static int[] insertionSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int key = nums[i];
			int j = i-1;
			
			while(j>=0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1]=key;
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] arr = {5,1,1,2,0,0};
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

}
