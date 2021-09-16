package BinaryTree;

public class LowestCommonAncestor {
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
//	 LOWEST COMMON ANCESTOR
	public Node lca(Node root,int v1,int v2) {
		 while (root != null){
		   if (root.data > v1 && root.data > v2)
		        root = root.left;
		   else if (root.data < v1 &&  root.data < v2)
		        root = root.right;
		   else break;
		    }
		    return root;
	}
	public int Distance(Node root,int v1,int v2) {
		if(root==null) {
			return -1;
		}
		Node lca=this.lca(root,v1,v2);
		int d1=Distance(lca,v1,0);
		int d2=Distance(lca,v2,0);
		return d1+d2;
	}
	// NUMBER OF NODES
	public static int Number(Node node) {
		if (node == null) {
		      return 0;
		    }
		return 1 + Number(node.left) + Number(node.right);
		  
	}
	public int getNumberOfLeafNodes(Node node) {
	    if (node == null) {
	      return 0;
	    }
	    
	    if(node.left == null && node.right == null) {
	      return 1;
	    }

	    return getNumberOfLeafNodes(node.left) + getNumberOfLeafNodes(node.right);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowestCommonAncestor tree=new LowestCommonAncestor();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        int v1=14;
        int v2=4;
        Node res=tree.lca(tree.root,v1,v2);
        System.out.println("Ancestor is : "+res.data);
        System.out.println("Total Leaf Nodes: " + tree.getNumberOfLeafNodes(tree.root));
        System.out.println("Number of Nodes :"+tree.Number(tree.root));

	}

}
