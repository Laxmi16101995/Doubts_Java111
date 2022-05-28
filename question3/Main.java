package com.question3;

import com.question3.Car.Engine;

public class Main {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c= new Car();
		c.setModel("Harrier");
		c.setColor("blue");
		c.setCompanyName("Tata");
		c.setModel("6th");
		
		Car.Engine e= c.new Engine();
		e.setRmp(1000);
		e.setPower(110);
		e.setManufacturer("tata");
		e.setHasTurbo(true);
		
		System.out.println(c);
		
		
	}

}
