// This is the first solution according to CrTCI book.

package ds.algo;

public class PermutationPalindrome {
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for(int count : table) {
			if(count%2 ==1) {
				if(foundOdd) {
					return false;
				}
				foundOdd=true;
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome(String input) {
		int[] table = FrequencyTableGenerator.buildCharFrequencyTable(input);
		return checkMaxOneOdd(table);
	}

	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));

	}

}
