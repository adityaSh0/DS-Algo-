package Abstraction;

public class Repair {
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}
	public static void main(String[] args) {
		WagonR a= new WagonR(); 
		Audi b=new Audi();
		repairCar(a);
		repairCar(b);
	}

}
