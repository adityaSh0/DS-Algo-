package Polymorphism;

public class Main {

	public static void main(String[] args) {
		Dog d=new Dog();
		Pet p=d;
		
		d.walk();
		p.walk();
	}

}
