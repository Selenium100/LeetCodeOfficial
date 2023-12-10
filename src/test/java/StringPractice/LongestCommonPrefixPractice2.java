package StringPractice;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefixPractice2 {
	
	public static String longestCommonPrefix(String[] words) {
		
		//sort the array
		Arrays.sort(words);
		StringBuffer sf = new StringBuffer();
		
		char []  firstWordChars = words[0].toCharArray();
		char [] lastWordChars = words[words.length-1].toCharArray();
		
		for(int i=0;i<firstWordChars.length;i++) {
			if(firstWordChars[i]!=lastWordChars[i]) {
				break;
			}else {
				 sf.append(firstWordChars[i]).toString();
			}
		}
		return sf.toString();
		
		
	}

	public static void main(String[] args) {
		
		String [] words = {"ilower","foy","flown"};
		
		System.out.println(longestCommonPrefix(words));
		

	}

}
