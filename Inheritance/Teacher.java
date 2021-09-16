package Inheritance;

public class Teacher extends Person {
	public void teach() {
		System.out.println(name+" can teach");
	}
	public void eat() {
		System.out.println(name+" can eat chips");//method overriding
		}

}
