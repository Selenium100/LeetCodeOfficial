package PracticeImpProblems;

import Array.RangeSumQuery;

public class Test {
	
	
	public static void main(String[] args) {
		int [] arr = {-2, 0, 3, -5, 2, -1};
		RangeSumQuery range = new RangeSumQuery(arr);
		System.out.println(range.rangeSum(0, 3));
	}
	

}
