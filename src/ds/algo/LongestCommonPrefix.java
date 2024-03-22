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

	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}

}
