package ds.algo;

public class SignProductOfArray {
	public static int arraySign(int[] nums) {
		int negativeCount =0;
		
		for(int num: nums) {
			if(num==0) {
				return 0;
			}else if(num<0){
				negativeCount++;
			}
		}
		
		return negativeCount %2 ==0 ? 1:-1;
	}

	public static void main(String[] args) {
		int arr[] = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
		System.out.println(arraySign(arr));
	}

}
