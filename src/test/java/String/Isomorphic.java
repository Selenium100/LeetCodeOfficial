package String;

import java.util.HashSet;

public class Isomorphic {
	
	public static boolean isIsomorphic(String s, String t ) {
		HashSet<String> hs = new HashSet<String>();
		StringBuffer sf = new StringBuffer();
	char[] eachCharInS =	 s.toCharArray();
	
	for(Character each: eachCharInS) {
		hs.add(String.valueOf(each));
	}
	
	
		
		if(s.toCharArray().length ==t.toCharArray().length) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	String	 s = "foo";
	String	t = "bar";
	
	System.out.println(isIsomorphic(s, t));

	}

}
