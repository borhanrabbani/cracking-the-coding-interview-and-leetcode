package ds.algo;

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {
		int si = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(si) == t.charAt(i)) {
				si++;
			}
			if (si == s.length()) {
				return true;
			}
		}
		return false;
	}

	public static boolean isSubsequence2(String s, String t) {
		
		// feasible than first one
		
		int i=0,j=0;
		int sl=s.length(), st=t.length();
		if(sl<1) {
			return true;
		}
		
		while(i<st) {
			if(t.charAt(i)==s.charAt(j)) {
				j++;
			}
			i++;
			if(j==sl) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		String t = "ahbgdc";
		String s = "abc";

		System.out.println(isSubsequence2(s, t));
	}

}
