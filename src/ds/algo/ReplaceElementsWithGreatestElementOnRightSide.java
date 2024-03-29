// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
// 1299. Replace Elements With Greatest Element On Right Side

package ds.algo;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static int[] replaceElements(int[] arr) {
//		আমার অলস মস্তিষ্কের সরল সমাধান 
		
		if(arr.length==1) {
			return new int[] {-1};
		}
		
		for(int i=0; i<arr.length; i++) {
			int max=-1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			arr[i]=max;
		}
		arr[arr.length-1]=-1;
		return arr;

	}
	
	public static int[] replaceElements2(int[] arr) {
		
//		feasible solution using single loop, better that first one
		
		if(arr.length==1) {
			return new int[] {-1};
		}
		int max=-1;
		int temp;
		for(int i=arr.length-1; i>=0; i--) {
			temp = arr[i];
			arr[i] = max;
			if(temp>max) {
				max=temp;
			}
		}
		
		return arr;
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements2(arr)));
	}

}
