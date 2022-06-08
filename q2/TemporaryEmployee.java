package com.q2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		//super.salary=4000;
		setHourlyWages(hourlyWages);
		this.hourlyWages=getHourlyWages();
		setHoursWorked(hoursWorked);
		this.hoursWorked=getHoursWorked();
	}
	
	

	public int getHoursWorked() {
		return hoursWorked;
	}



	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}



	public int getHourlyWages() {
		return hourlyWages;
	}



	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}



	@Override
	void calculateSalary() {
		TemporaryEmployee pm1= new TemporaryEmployee(101, "Laxmi", 200, 20);

		double s= pm1.getHoursWorked() * pm1.getHourlyWages();

		pm1.setSalary(s);
	}
	
	
}
