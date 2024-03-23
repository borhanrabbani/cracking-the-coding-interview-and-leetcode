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
	
	public static boolean isIsomorphicOptimized(String s, String t) {
		// optimized than hash Map
        int[] m1= new int[256];
        int[] m2= new int[256]; 
        for(int i=0; i<s.length(); i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
    }

	public static void main(String[] args) {
		
	}

}
