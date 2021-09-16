package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import BinaryTree.LowestCommonAncestor.Node;


public class View {
	Node root;
	public class Node{
		int data;
		int height;
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
public void topview() {
	TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
	Queue<Node> q=new LinkedList<>();
	q.offer(root);
	while (!q.isEmpty()) {
	      Node temp = q.poll();
	      int hd = temp.height;
	      if (map.get(hd) == null) {
	        map.put(hd, temp.data);
	      }
	      if (temp.right != null) {
	          temp.right.height = hd + 1;
	          q.add(temp.right);
	        }
	      if (temp.left != null) {
	          temp.left.height = hd + 1;
	          q.add(temp.left);
	        }
	      
	      }
	      System.out.println(map.values());
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View v=new View();
		v.createTree();
		v.topview();
		
		

	}

}
