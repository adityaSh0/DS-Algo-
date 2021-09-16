package Inheritance;

public class Singer extends Person {
	public void sing() {
		System.out.println("A Singer can sing");
	}

	public void eat() {
		System.out.println(name+" can eat choclates");	//method overriding
		}
}
