package StringPractice;

import java.util.Arrays;

public class LongestCommonPrefixPractice {
	
	public static String longestCommonPrefix(String[] words) {
		
		Arrays.sort(words);
		StringBuffer sf = new StringBuffer();
		
		char[] firstWordChars = words[0].toCharArray();
		char[] lastWordChars = words[words.length-1].toCharArray();
		
		
		for(int i=0;i<firstWordChars.length;i++) {
			if(firstWordChars[i]!=lastWordChars[i]) {
				break;
			}else {
				sf.append(firstWordChars[i]);
			}
		}
		return sf.toString();
		
	}

	public static void main(String[] args) {
		
		String[] words = {"flower","fly","flyover"};
		String word =  longestCommonPrefix(words);
		System.out.println(word);
	}

}
