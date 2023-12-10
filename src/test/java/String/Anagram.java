package String;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
	char[] str1ToChar = 	 str1.toCharArray();
	char[] str2ToChar = 	 str2.toCharArray();
	
    Arrays.sort(str1ToChar);
    Arrays.sort(str2ToChar);
    
    for(int i=0;i<str1ToChar.length;i++) {
    	if(str1ToChar[i]!=str2ToChar[i]) {
    		return false;
    	}
    }
	return true;
	}

	public static void main(String[] args) {
		
		String str1 = "anagram";
		String str2 = "nagaram";
		
		System.out.println(isAnagram(str1, str2));

	}

}
