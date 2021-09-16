package BinaryTree;

import java.util.Stack;

public class Preorder {
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			
		}
	}
	public void createTree() {
		Node first=new Node(9);
		Node second=new Node(2);
		Node third=new Node(3);
		Node four=new Node(4);
		
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=four;
		
		
	}
	public void preorder() {
		if(root == null) {
			return;
		}
		Stack<Node> st=new Stack<>();
		st.push(root);
		while(!st.isEmpty()) {
			Node temp=st.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				st.push(temp.right);
			}
			if(temp.left!=null) {
				st.push(temp.left);
			}
		}
	}
	// RECURSIVE
//	public void preOrder(Node root) {
//		if(root == null) {
//			return;
//		}
//
//		System.out.print(root.data + " ");
//		preOrder(root.left);
//		preOrder(root.right);
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Preorder pr=new Preorder();
		pr.createTree();
//		pr.preorder(pr.root);
		pr.preorder();

	}

}
