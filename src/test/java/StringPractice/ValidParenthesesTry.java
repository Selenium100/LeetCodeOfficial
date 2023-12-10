package StringPractice;

import java.util.Stack;

public class ValidParenthesesTry {
	
	public static boolean isValid(String str) {
		
		Stack<Character> stack = new Stack<Character>();

		   for(Character c: str.toCharArray()){
			if(c == '{' || c=='(' || c=='['){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return false;
				}else{
					Character topChar = stack.peek();
					if(c=='}' && topChar == '{' || c==']' && topChar == '[' ||  c=='}' && topChar == '{'){
						stack.pop();
					}
				}

				
			}
			
		   }
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		String str = "[";
		boolean flag = isValid(str);
		System.out.println(flag);

	}

}
