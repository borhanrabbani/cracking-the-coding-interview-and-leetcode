package ds.algo;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
		}
		
		int max=0;
		for(int frequency: frequencyMap.values()) {
			if(frequency>max) {
				max = frequency;
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
			if(entry.getValue()==max) {
				return entry.getKey();
			}
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}

}
