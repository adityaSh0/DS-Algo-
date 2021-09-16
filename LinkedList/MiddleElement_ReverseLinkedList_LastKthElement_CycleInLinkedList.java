package LInkedList;

public class MiddleEle {
	Node head;
	public void add(int data) {
		Node toadd=new Node(data);
		if(head==null) {
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
	}
	public void print(){
		if(head==null) {
			System.out.println("NULL");
		}
		Node temp=head;
		if(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	// MIDDLE ELEMENT IN A LINKEDLIST
	public void printMiddle() {
		Node slowptr=head;
		Node fastptr= head;
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		System.out.println( slowptr);
	}
	// REVERSING LINKEDLIST
	public Node reverse() {
		Node current=head;
		Node nex=null;
		Node previous=null;
		while(current!=null) {
			nex=current.next;
			current.next=previous;
			previous=current;
			current=nex;
		}
		return previous;
	}
	// REMOVING DUPLICATES
	public void dupicates() {
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;			
			}else
				temp=temp.next;
		}
	}
	// Size OF LINKEDLIST
	public int size() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	// LAST N NODE IN A LINKEDLIST
	public void last() {
		Node mainptr=head;
		Node temp=head;
		int n=2;
		int c=0;
		while(c<n) {
			temp=temp.next;
			c++;
		}
		while(temp.next!=null) {
			temp=temp.next;
			mainptr=mainptr.next;
		}
		System.out.println(mainptr.data) ;
	}
	// LOOP IN A SINGLY LINKEDLIST
	public boolean loop() {
		Node fastptr=head;
		Node slowptr=head;
		while(fastptr!=null && fastptr.next!=null) {
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
			if(fastptr==slowptr) {
				return true;
			}
		}
		return false;
	}

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void main(String[]args) {
		MiddleEle ll=new MiddleEle();
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.print();
		
		ll.last();
	}
	
}