package Array;

import java.util.Arrays;

public class PlusOne {

	// https://leetcode.com/problems/plus-one/

	public static int[] plusOne(int[] arr) {

		int n = arr.length;

		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			} else {
				arr[i] = 0;
			}
			
			
		}
		
		int[] newNum = new int[n+1];
		newNum[0]=1;
		return newNum;
		
		
		
	}

	public static void main(String[] args) {

		int[] arr = {1,0,0};
		System.out.println(Arrays.toString(plusOne(arr)));
	}

}
