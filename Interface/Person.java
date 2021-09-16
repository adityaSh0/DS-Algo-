package Interface;

public class Person implements Youtuber,Student{
	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.makeVideo();
		

	}
	@Override
	public void makeVideo() {
		System.out.println("A person makes video as hard as he can");
	}

	@Override
	public void study() {
		System.out.println("A person study as hard as he can");
		
	}

}
