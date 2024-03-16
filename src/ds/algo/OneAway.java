package ds.algo;

public class OneAway {
	
	public static boolean oneEditAway(String first, String second) {
		if(first.length() == second.length()) {
			return OneEditReplace(first, second);
		}else if(first.length()+1 == second.length()) {
			return oneEditInsert(first, second);
		}else if(first.length()-1 == second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
	}
	
	public static boolean OneEditReplace(String str1, String str2) {
		boolean foundDifference = false;
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				if(foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		
		return true;
	}
	
	public static boolean oneEditInsert(String str1, String str2) {
		int index1=0;
		int index2=0;
		while(index2<str2.length() && index1<str1.length()) {
			if(str1.charAt(index1) != str2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String a = "pse";
		String b = "pale";
		boolean isOneEdit = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);

	}

}
