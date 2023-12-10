package Array;

public class RemoveElement {
	
	//https://leetcode.com/problems/remove-element/
	
	public static int removeElement(int[] arr, int target) {
		
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=target) {
				arr[counter]= arr[i];
				counter++;
			}
		}
		return counter;
		
	}

	public static void main(String[] args) {
		int[] arr = {3,2,2,3};
		System.out.println(removeElement(arr, 2));

	}

}
