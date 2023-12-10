package Array;

public class TrappingRainWater {
	
	public static int trap(int[] heights) {
		
		int length = heights.length;
		int[] left = new int[length];
		int[] right = new int[length];
		
		left[0]=heights[0];
		
		for(int i=1;i<length;i++) {
			left[i] = Math.max(left[i-1], heights[i]);
		}
		
		right[length-1]=heights[length-1];
		
		for(int i=length-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], heights[i]);
		}
		
		int ans =0;
		
		for(int i=0;i<length;i++) {
			ans+= Math.min(left[i], right[i])-heights[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] heights = {4,2,0,3,2,5};
		System.out.println(trap(heights));
		

	}

}
