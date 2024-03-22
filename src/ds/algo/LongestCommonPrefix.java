package ds.algo;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		String prefix=strs[0];
		
		for(int i=0; i<strs.length; i++) {
			int j=0;
			while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j)==strs[i].charAt(j)) {
				j++;
			}
			prefix= prefix.substring(0,j);
			
			if(j==0) {
				break;
			}
		}
			
		return prefix;
		
	}
	
	public static String longestCommonPrefixOptimized(String[] strs) {
		Arrays.sort(strs);
		String s1=strs[0];
		String s2=strs[strs.length-1];
		int idx=0;
		while(idx<s1.length() && idx<s2.length()) {
			if(s1.charAt(idx)!=s2.charAt(idx)) {
				break;
			}
			idx++;
		}
			
		return s1.substring(0, idx);
		
	}

	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		System.out.println(longestCommonPrefixOptimized(str));
	}

}
