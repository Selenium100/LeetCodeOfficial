package Array;

import java.util.LinkedHashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] arr,int target) {
		
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int expNum = target-arr[i];
			if(hm.containsKey(expNum)) {
				return new int[] {i,hm.get(expNum)};
			}else {
				hm.put(arr[i], i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		

	}

}
