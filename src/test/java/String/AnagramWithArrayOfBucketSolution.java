package String;

public class AnagramWithArrayOfBucketSolution {
	
	public static boolean isAnagram(String str1,String str2) {
		
		//Convert both strings to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//Remove spaces between them.
		str1.replace(" ", "");
		str2.replace(" ", "");
		
		//Initialize an empty array of all alphabates
		int[] count = new int[26];
		
		//fill the array
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
		}
		
		//empty the array
		for(int i=0;i<str2.length();i++) {
			count[str2.charAt(i)-'a']--;
		}
		
		//check if all buckets are empty
		for(int eachcount:count) {
			if(eachcount!=0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		

	}

}
