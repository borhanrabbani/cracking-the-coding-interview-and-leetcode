package ds.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		// অলস মস্তিষ্কের সরল সমাধান। 
		
		List<Integer> resultList = new ArrayList<Integer>();
		Set<Integer> check = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			check.add(nums[i]);
		}
		
		for(int i=1; i<=nums.length; i++) {
			if(!check.contains(i)) {
				resultList.add(i);
			}
		}
		
		return resultList;
	}
	
	public static List<Integer> findDisappearedNumbersOptimized(int[] nums) {
		List<Integer> resultList = new ArrayList<Integer>();
		
		int n = nums.length;
		
		boolean[] present = new boolean[n];
		
		for(int i=0; i<nums.length; i++) {
			present[nums[i]-1]=true;
		}	
		
		for(int i=0; i<n; i++) {
			if(!present[i]) {
				resultList.add(i+1);
			}
		}
		
		return resultList;
		
	}
	
	public static List<Integer> findDisappearedNumbersSpaceOptimized(int[] nums) {
		List<Integer> resultList = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			int index = Math.abs(nums[i])-1;
			if(nums[index]>0) {
				nums[index]=-nums[index];
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>0) {
				resultList.add(i+1);
			}
		}
				
		return resultList;
		
	}

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		int arr2[] = {1,1};
		System.out.println(findDisappearedNumbersOptimized(arr));
		System.out.println(findDisappearedNumbersOptimized(arr2));
		System.out.println(findDisappearedNumbers(arr2));
	}

}
