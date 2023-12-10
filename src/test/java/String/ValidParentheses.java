package String;

import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid(String str) {
		
		Stack<Character> charStack = new Stack<Character>();
		
		for(Character eachChar: str.toCharArray()) {
			if(eachChar=='(') {
				charStack.push(')');
			}else if(eachChar=='{') {
				charStack.push('}');
			}else if(eachChar=='[') {
				charStack.push(']');
			}else if(charStack.isEmpty() ||  charStack.pop()!=eachChar) {
				return false;
			}
		}
		return charStack.isEmpty();
	}

	public static void main(String[] args) {
		

	}

}
