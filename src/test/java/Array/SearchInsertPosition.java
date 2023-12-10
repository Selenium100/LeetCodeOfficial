package Array;

public class SearchInsertPosition {
	
	//https://leetcode.com/problems/search-insert-position/
	
	public static int insertPosition(int[] arr,int target) {
		
		int start=0;
		int end =arr.length-1;
		int mid =0;
		
		while(start<=end) {
			
			mid = (start+end)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(target<arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return start;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,6};
		int target = 2;
		
		System.out.println(insertPosition(arr, target));
		

	}

}
