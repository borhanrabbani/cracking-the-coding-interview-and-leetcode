package ds.algo;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> charMap = new HashMap<>();
		Map<Character, Character> reverseMap = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char chars= s.charAt(i);
			char chart= t.charAt(i);
			
			if(charMap.containsKey(chars)) {
				if(charMap.get(chart)!=chart) {
					return false;
				}
			}else {
				charMap.put(chars, chart);
			}
			
			if(reverseMap.containsKey(chart)) {
				if(reverseMap.get(chart)!=chars) {
					return false;
				}
			}else {
				reverseMap.put(chart, chars);
			}
		}
		return true;

	}

	public static void main(String[] args) {
		
	}

}
