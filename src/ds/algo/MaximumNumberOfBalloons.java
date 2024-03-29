package ds.algo;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
	public static int maxNumberOfBalloons(String text) {
//		হাতড়ানো সমাধান। 
		
		Map<Character, Integer> charMap = new HashMap<>();
		String target = "balloon";
		for (char ch : text.toCharArray()) {
			if (target.indexOf(ch) != -1) {
				if (charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch) + 1);
				} else {
					charMap.put(ch, 1);
				}
			}
		}
		int minCount = Integer.MAX_VALUE;

		for (char ch : target.toCharArray()) {
			int count = charMap.getOrDefault(ch, 0);
			if(ch=='l' || ch=='o') {
				count /= 2;
			}
			minCount = Math.min(count, minCount);
		}
		return minCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
