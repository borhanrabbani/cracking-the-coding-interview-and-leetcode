// https://leetcode.com/problems/word-pattern/description/

package ds.algo;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public boolean wordPattern(String pattern, String s) {
		
		String[] words = s.split(" ");
		if (pattern.length() != words.length) {
			return false;
		}
		
		Map<Character, String> patternMap = new HashMap<>();
		
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			if (patternMap.containsKey(ch)) {
				if (!patternMap.get(ch).equals(words[i])) {
					return false;
				}
			} else {
				if (patternMap.containsValue(words[i])) {
					return false;
				}
				patternMap.put(ch, words[i]);
			}

		}
		return true;
	}

	public static void main(String[] args) {

	}

}
