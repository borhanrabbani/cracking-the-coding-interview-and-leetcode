package ds.algo;

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {
		int si=0;
		for(int i=0; i<t.length(); i++) {
			if(s.charAt(si)==t.charAt(i)) {
				si++;
			}
			if(si==s.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String t = "ahbgdc";
		String s = "abc";
		
		System.out.println(isSubsequence(s,t));
	}
	

}
