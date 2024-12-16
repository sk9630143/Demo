package java17;

public class Sealed {

	public static void main(String[] args) {
		// Bike reference
		Bike bike = new Bike();
		bike.m1();//Method call.... 
		
		//Car reference
		Car car = new Car();
		car.m1();//Method call.... 
	}

}

sealed class Vehicle permits Bike, Car {
	
	public void m1() {
		System.out.println("Method call.... ");
	}
}

non-sealed class Bike extends Vehicle {
	
}

non-sealed class Car extends Vehicle {
	
}