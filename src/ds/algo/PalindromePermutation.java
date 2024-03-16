package ds.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePermutation {

	private static Set<String> generatePermutations(String input) {
		Set<String> permutations = new HashSet<>();
		if (input == null || input.length() == 0) {
			permutations.add("");
			return permutations;
		}
		
		backtrack(input.toCharArray(),0, new StringBuilder(), permutations);

		
		return permutations;
	}
	
	private static void backtrack(char[] chars, int index, StringBuilder current, Set<String> permutations) {
		if(index == chars.length) {
			if(isPalindrome(current.toString())) {
				permutations.add(current.toString());
			}
			return;
		}
		for(int i=index; i<chars.length; i++) {
			current.append(chars[i]);
			backtrack(chars, i+1, current, permutations);
			current.deleteCharAt(current.length()-1);
		}
	}

//	private static void permutationHelper(char[] chars, int index, List<String> permutations) {
//		if (index == chars.length/2) {
//			permutations.add(new String(chars));
//			return;
//		}
//		for (int i = index; i < chars.length; i++) {
//			swap(chars, index, i);
//			permutationHelper(chars, index + 1, permutations);
//			swap(chars, index, i);
//		}
//
//	}
//
//	private static void swap(char[] chars, int i, int j) {
//		char temp = chars[i];
//		chars[i] = chars[j];
//		chars[j] = temp;
//	}

	private static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s+", "").toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String input = "RATS LIVE ON NO EVIL STAR";
		Set<String> permutations = generatePermutations(input);
		for (String permutation : permutations) {
			if (isPalindrome(permutation)) {
				System.out.println(permutation);
			}

		}

	}

}
