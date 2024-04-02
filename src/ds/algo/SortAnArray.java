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
	
//	Selection sort couldn't solve the leetcode problem.
//	Time limit code exceeded.
	
	public static int[] selectionSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				swap(nums,i,minIndex);
			}
		}
		
		return nums;
	}
	
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {5,1,1,2,0,0};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
