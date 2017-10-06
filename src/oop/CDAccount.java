package oop;

public class CDAccount extends BankAccount implements Rate {
	
	String interestRate;
	
	void compound(){
		System.out.println("Compounding interest.");
	}
}
