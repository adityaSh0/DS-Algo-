package LInkedList;

import LInkedList.MiddleEle.Node;

public class MyLinkedList<E>{
	Node<E> head;
// ADD	
	public void add(E data) {
		Node<E> toadd=new Node<E>(data);
		if(isEmpty()) {
			head=toadd;
			return;
		}
		Node<E> temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
//Print
	public void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
//Empty		
	public boolean isEmpty() {
			return head==null;
	}
//RemoveLast
	public E removeLast() throws Exception {
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot remove from empty list");
		}
		if(temp.next==null) {
			Node<E> toremove=head;
			head=null;
			return toremove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toremove=temp.next;
		temp.next=null;
		return toremove.data;
	}
//GetLast	
	public E getLast() throws Exception{
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot peek from empty list");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
		
	}
		
//StaticClass
	public static class Node<E>{
		public E data;
		public Node<E> next;
		public Node(E data) {
			this.data=data;
			next=null;
			
		}
	}
}
