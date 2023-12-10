package Array;

import java.util.Arrays;

public class MergeSortedArray {
	
	//https://leetcode.com/problems/merge-sorted-array/
	
	public static void mergeTowSortedArray(int[] num1,int[] num2,int m,int n) {
		
		int p1 = m-1;
		int p2 = n-1;
		int k = m+n-1;
		
		while(p2>=0) {
			
			if(p1>=0 && num1[p1]>num2[p2]) {
				
				num1[k]= num1[p1];
				p1--;
				k--;
			}else {
				num1[k]=num2[p2];
				p2--;
				k--;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m = 3;
		int n = 3;
		
		mergeTowSortedArray(num1, num2, m, n);
		System.out.println(Arrays.toString(num1));

	}

}
