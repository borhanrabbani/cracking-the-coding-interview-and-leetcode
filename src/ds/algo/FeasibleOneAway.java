package ds.algo;

public class FeasibleOneAway {
	public static boolean oneEditAway(String first, String second) {
		if(Math.abs(first.length()-second.length())>1) {
			return false;
		}
		
		String shorter = first.length() < second.length() ? first:second;
		String longer = first.length() < second.length() ? second:first;
		
		int index1=0, index2=0;
		boolean foundDifference = false;
		
		while(index1 <shorter.length() && index2 < longer.length()) {
			if(shorter.charAt(index1) != longer.charAt(index2)) {
				if(foundDifference) {
					return false;
				}
				foundDifference = true;
				if(shorter.length() == longer.length()) {
					index1++;
				}
			}else {
				index1++;
			}
			index2++;
		}
		return true;
	}

	public static void main(String[] args) {
		String a = "pae";
		String b = "pale";
		boolean isOneEdit = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);

	}

}
