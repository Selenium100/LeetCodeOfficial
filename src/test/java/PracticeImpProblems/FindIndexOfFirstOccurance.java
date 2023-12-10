package PracticeImpProblems;

public class FindIndexOfFirstOccurance {
	
	public static int findIndexOfFirstOccurance(String haystack, String needle) {
		
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			String val = haystack.substring(i,needle.length()+1);
			
			if(val.equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		//sadmadsad
		//mad
		//3

	}

}
