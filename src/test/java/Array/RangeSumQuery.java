package Array;

public class RangeSumQuery {
	
	int[] arr;
	
	public RangeSumQuery(int[] arr) {
		
		this.arr=arr;
		
	}

	public  int rangeSum( int left, int right) {
		 if(arr==null){
	           return -1;
	       }
		 
		int counter = 0;

		for (int i = left; i <= right; i++) {

			counter += arr[i];
		}
		return counter;
	}

}




