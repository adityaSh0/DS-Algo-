
package VectorAndStack;
import java.util.Scanner;
import java.util.Stack;

public class BracketsBalancing {

	public static void main(String[] args) {
		Stack<Character> stack= new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		String  x=sc.next();
		boolean isbalanced=false;
		for(int i=0;i<x.length();i++) {
			if(!stack.empty()) {
				switch(x.charAt(i)) {
				case')':
					if(stack.peek()=='(') {
						stack.pop();
						isbalanced=true;
					}
					break;
				case'}':
					if(stack.peek()=='{') {
						stack.pop();
						isbalanced=true;
					}
					break;
				case']':
					if(stack.peek()=='[') {
						stack.pop();
						isbalanced=true;
					}
					break;
				default:
					stack.push(x.charAt(i));
				}
			}
			else {
				stack.push(x.charAt(i));
			}
		}
		if(isbalanced) {
			System.out.println("True");
		}
		else
			System.out.println("Go and enter balanced paranthesis");
}

}
