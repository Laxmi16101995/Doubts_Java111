package com.q2;

public class Main {

	public static void main(String[] args) {
		
		Loan l= Loan.get();
		PermanentEmployee pm= new PermanentEmployee(101, "Laxmi", 200);
		//System.out.println("Loan amount: "+l.calculateLoanAmount(pm));
		TemporaryEmployee pm1= new TemporaryEmployee(101, "Laxmi", 200, 20);
		l.calculateLoanAmount(pm1);
		//System.out.println("Loan amount: "+l.calculateLoanAmount(pm1));

	}

}
