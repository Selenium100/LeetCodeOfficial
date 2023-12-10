package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RomanToInteger {
	
	public static int convertRomanToInteger(String s) {
		
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		
	     s=s.replace("IV", "IIII");
	     s= s.replace("IX", "VIIII");
	     s=s.replace("XL", "XXXX");
	     s=s.replace("XC", "LXXXX");
	     s=s.replace("CD", "CCCC");
	     s=s.replace("CM", "DCCCC");
	     
	     char[] eachChar = s.toCharArray();
	     
	     int counter=0;
	     for(int i=eachChar.length-1;i>=0;i--) {
	    	 if(hm.containsKey(String.valueOf(eachChar[i])  )) {
	    		 counter+=hm.get(String.valueOf(eachChar[i]));
	    	 }
	    	 
	     }
		return counter;
		
	}

	public static void main(String[] args) {
		
		int num = convertRomanToInteger("IV");
		System.out.println(num);

	}

}
