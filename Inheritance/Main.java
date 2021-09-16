package Inheritance;

public class Main {
	public static void main(String []args) {
		Teacher t=new Teacher();
		Person p=t; //upcasting
		Teacher t1=(Teacher) p; //downcasting
		
		
//		Singer s=new Singer();
//		s.name="Salena";
//		s.walk();
//		s.sing();
//		s.eat();
		System.out.println(t1 instanceof Person);
		System.out.println(t instanceof Person);
	}

}
