package Enapsulation;

public class EncapsulationIntro {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.println("You are too old to study in our school");
		}
		else {
			this.age=age;
		}
	}
	public void setName(String name) {
		this.name=name;	
		System.out.println(name);
	}
}
