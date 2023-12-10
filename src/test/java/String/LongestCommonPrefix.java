package String;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] words) {
		Arrays.sort(words);
		StringBuilder sb = new StringBuilder();
		
		char[] firstWord = words[0].toCharArray();
		char[] lastWord = words[words.length-1].toCharArray();
		
		for(int i=0;i<firstWord.length;i++) {
			if(firstWord[i] != lastWord[i]) {
				break;
			}else {
				sb.append(firstWord[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String[] words= {"tiger","cat","animal"};
		String longestPrefix =   longestCommonPrefix(words);
		System.out.println(longestPrefix);

	}

}
