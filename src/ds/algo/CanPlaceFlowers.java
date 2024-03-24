package ds.algo;

public class CanPlaceFlowers {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(flowerbed.length==1 && flowerbed[0]==0) {
			return true;
		}
		
		int count = 0;
		
		for (int i = 0; i < flowerbed.length; i++) {
			if (i == 0) {
				if (flowerbed[0] == 0 && flowerbed[1] == 0) {
					flowerbed[0] = 1;
					count++;
				}
			} else if (i == flowerbed.length - 1) {
				if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
					flowerbed[i] = 1;
					count++;
				}
			} else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
				flowerbed[i] = 1;
				count++;
			}
		}

		return count >= n;

	}

	public static void main(String[] args) {
		int[] arr = { 0,0,1,0,0 };
		System.out.println(canPlaceFlowers(arr, 1));
	}

}
