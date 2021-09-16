package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.View.Node;

public class LevelOrder {
	Node root;
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public void createTree(){
		Node first=new Node(1);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		Node seven=new Node(7);
		Node eight=new Node(8);
		
		root=first;
		root.left=second;
		root.right=three;
		second.left=four;
		second.right=five;
		five.right=seven;
		five.left=six;
		three.right=eight;
	}
	public void levelorder() {
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right!=null) {
				q.offer(temp.right);
			}
		}
		
	}
//	MAXIMUM
	public int Max(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int result=root.data;
		int left=Max(root.left);
		int right=Max(root.right);
		if(left>result) {
			return left;
		}
		if(right>result) {
			return right;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrder l=new LevelOrder();
		l.createTree();
		l.levelorder();
		System.out.println("       "+l.Max(l.root));

	}

}
