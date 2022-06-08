package com.q2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		super.salary=2000;
		this.basicPay=basicPay;
	}
	
	



	@Override
	void calculateSalary() {
		
		PermanentEmployee pm= new PermanentEmployee(101, "Laxmi", 200);
		
		double pfAmount= pm.basicPay * 0.12;
		double a= pm.basicPay - pfAmount;
		pm.salary=a;
	
	}
}
