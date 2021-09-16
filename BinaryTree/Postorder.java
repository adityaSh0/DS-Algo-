package BinaryTree;

import java.util.Stack;

public class Postorder {
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public void createTree(){
		Node first=new Node(9);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		
		root=first;
		root.left=second;
		root.right=three;
		second.left=four;
		}
	
	public void postorder(){
		
		Stack<Node> st=new Stack<>();
		Node temp=root;
		while(!st.isEmpty() || temp!=null) {
			if(temp!=null) {
				st.push(temp);
				temp=temp.left;
				}
			else {
				Node curr=st.peek().right;
				if(curr==null) {
					curr=st.pop();
					System.out.print(curr.data+" ");
					while(!st.isEmpty() && curr==st.peek().right) {
						curr=st.pop();
						System.out.print(curr.data+" ");
					}
				}
				else {
					temp=curr;
				}
			}
		}
	}
//	public void postorder(Node root) {
//		if(root == null) {
//			return;
//		}
//
//		postorder(root.left);
//		postorder(root.right);
//		System.out.print(root.data + " ");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postorder po=new Postorder();
		po.createTree();
//		po.postorder(po.root);
		po.postorder();

	}

}
