package com.woori.test;

class Car{
	int serialNumber;
	static int counter;
	Car(){
		counter++;
		serialNumber=counter;
	}
}

public class staticTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("===Non-Static Variable===");
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		System.out.println("===Static Varibale===");
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);

		System.out.println(Car.counter);

	}
}
