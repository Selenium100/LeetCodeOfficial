package PracticeImpProblems;

public class ValidPalindrome {
	
	public static boolean isPalisPalindrome(String str) {
		String replacedString =  str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		StringBuffer sb = new StringBuffer(replacedString);
		
		String reverseString = sb.reverse().toString();
		
		if(replacedString.equals(reverseString)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal: Panama";
		
		System.out.println(isPalisPalindrome(str));
		
	}

}
