package Array;

public class RemoveDuplicateFronSortedArray {
	
	//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	
	public static int removeDulicates(int[] arr) {
		
		int counter=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[counter]!=arr[i]) {
				counter++;
				arr[counter] = arr[i];
			}
		}
		return counter+1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,4,5};
		System.out.println(removeDulicates(arr));

	}

}
