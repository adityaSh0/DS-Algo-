package BinaryTree;

import java.util.Stack;

public class Inorder {
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public void CreateTree() {
		Node first=new Node(9);
		Node second=new Node(2);
		Node third=new Node(3);
		Node four=new Node(4);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=four;
		
	}
	public void inorder() {
		if(root==null) {
			return;
		}
		Stack<Node> st=new Stack<>();
		Node temp=root;
		while(!st.isEmpty() || temp!=null) {
			if(temp!=null) {
				st.push(temp);
				temp=temp.left;
			}
			else {
				temp =st.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
		
	}
//	public void inorder(Node root) {
//		if(root==null) {
//			return;
//		}
//		inorder(root.left);
//		System.out.print(root.data);
//		inorder(root.right);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inorder in=new Inorder();
		in.CreateTree();
//		in.inorder(in.root);
		in.inorder();
	}

}
