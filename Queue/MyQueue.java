package Queue;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue2<Integer> q=new MyQueue2<>();
		q.enqueue(12);
		q.enqueue(14);
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
