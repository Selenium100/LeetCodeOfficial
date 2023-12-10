package PracticeImpProblems;

public class TappingRainWater {

	//https://leetcode.com/problems/trapping-rain-water/
	
	public static int trap(int[] heights) {
		
		int l = heights.length;
		
		int[] left = new int[l];
		int[] right = new int[l];
		
	    left[0]=heights[0];
	    
	    for(int i=1;i<l;i++) {
	    	left[i] = Math.max(left[i-1], heights[i]);
	    }
	    
	    right[l-1] = heights[l-1];
	    
	    for(int i=l-2;i>=0;i--) {
	    	right[i] = Math.max(right[i+1], heights[i]);
	    }
	    
	    int res =0;
	    
	    for(int i=0;i<l;i++) {
	    	
	    	res+=Math.min(left[i], right[i])-heights[i];
	    }
		return res;
	    
		
	}
	public static void main(String[] args) {
		
		int[] heights = {4,2,0,3,2,5};
		System.out.println(trap(heights));
		

	}

}
