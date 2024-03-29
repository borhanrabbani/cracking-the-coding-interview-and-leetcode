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
			if (ch == 'l' || ch == 'o') {
				count /= 2;
			}
			minCount = Math.min(count, minCount);
		}
		return minCount;
	}

	public static int maxNumberOfBalloonsOptimized(String text) {

		int[] charCount = new int[26];
		String target = "balloon";
		for (char ch : text.toCharArray()) {
			if (target.indexOf(ch) != -1) {
				charCount[ch - 'a']++;
			}
		}
		int minCount = Integer.MAX_VALUE;

		for (char ch : target.toCharArray()) {
			int count = charCount[ch - 'a'];
			if (ch == 'l' || ch == 'o') {
				count /= 2;
			}
			minCount = Math.min(count, minCount);
		}
		return minCount;
	}

	public static int maxNumberOfBalloonsBestOptimized(String text) {
		int a = 0, b = 0, l = 0, o = 0, n = 0;

		for (char ch : text.toCharArray()) {
			switch (ch) {
			case 'a':
				++a;
				break;
			case 'b':
				++b;
				break;
			case 'l':
				++l;
				break;
			case 'o':
				++o;
				break;
			case 'n':
				++n;
				break;
			}
		}
		
		return Math.min(Math.min(l/2, o/2), Math.min(Math.min(a, b), n));
	}

	public static void main(String[] args) {

		String str = "loonbalxballpoon";
		System.out.println(maxNumberOfBalloonsBestOptimized(str));
	}

}
