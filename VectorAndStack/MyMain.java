package VectorAndStack;

public class MyMain {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> st=new MyStack();
		st.push(12);
		st.push(24);
		st.push(36);
		int popped = st.pop();
		System.out.println(popped);
		System.out.println(st.peek());

	}

}
