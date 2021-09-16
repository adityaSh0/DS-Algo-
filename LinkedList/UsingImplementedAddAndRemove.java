package LInkedList;

public class UsingMyLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> myll=new MyLinkedList<Integer>();
		for(int i=0;i<10;i++) {
			myll.add(i);
		}
		myll.print();

	}

}
