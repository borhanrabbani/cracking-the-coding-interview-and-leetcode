package ds.algo;

public class RemovePalindromicSubsequence {

	public static int removePalindromeSub(String s) {
		if(isPalindrome(s)) {
			return 1;
		}
		return 2;
		
	}
	
	
//	Solution using StringBuilder
	
	public int removePalindromeStringBuilder(String s) {
		return s.isEmpty() ? 0 : (s.equals(new StringBuilder(s).reverse().toString()) ? 1:2);
	}
	
	public static boolean isPalindrome(String str) {
		int left=0, right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
