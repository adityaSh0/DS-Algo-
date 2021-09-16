package VectorAndStack;

import LInkedList.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList<>();
	
	void push(E e){
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty()){
			throw new Exception("Popping remove from empty stack");
		}
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty()){
			throw new Exception("Peeking remove from empty stack");
		}
		return ll.getLast();
	}

}
