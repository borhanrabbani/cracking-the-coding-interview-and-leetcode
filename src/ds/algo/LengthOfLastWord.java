package ds.algo;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		s=s.trim(); // removes leading and trailing spaces
		
		int lastSpaceIndex = s.lastIndexOf(' ');
		
		s=s.substring(lastSpaceIndex+1);
		
		return s.length();
	}
	
	public static int lengthOfLastWord2(String s) {
		// without using any built in function
		
		int length=0;
		boolean lastWord=false;
		
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)!=' ') {
				length++;
				lastWord=true;
			}else if(lastWord) {
				break;
			}
		}
		
		return length;
	}

	public static void main(String[] args) {
		String str = "luffy is still joyboy";
		System.out.println(str.substring(4));
		System.out.println(lengthOfLastWord2(str));
	}

}
