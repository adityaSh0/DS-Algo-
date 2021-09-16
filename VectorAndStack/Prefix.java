package VectorAndStack;

import java.util.Stack;

public class Prefix {
	static int pre(String s) {
		Stack<Integer> st=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				st.push(s.charAt(i)-'0');
			}
			else {
				int op1=st.peek();
				st.pop();
				int op2=st.peek();
				st.pop();
				
				switch(s.charAt(i)) {
				case '+':
					st.push(op1+op2);
					break;
				
				case '-':
					st.push(op1-op2);
					break;
				
				case '*':
					st.push(op1*op2);
					break;
				
				}
			}
		}
		return st.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pre("-+7*45+20"));

	}

}
