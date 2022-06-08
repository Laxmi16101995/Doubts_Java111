package com.q2;

public class Loan {
	
	private Loan() {
		
	}

	public void calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			
			double am= employeeObj.salary*15;
			double amm= am/100;
			//return amm;
		}else{
			Employee e= (Employee)employeeObj;
			double am= e.getSalary()*10;
			System.out.println(e.getSalary());
			double amm= am/100;
			//return amm;
		}
		//return 0;
	}
	
	public static Loan get() {
		Loan lo= new Loan();
		return lo;
	}
}
