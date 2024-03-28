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

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}

}
