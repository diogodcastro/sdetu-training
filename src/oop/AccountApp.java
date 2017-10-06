package oop;

public class AccountApp {

	public static void main(String[] args) {

		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setTerm(20);
		la.setAmortSchedule();
		
		//Polymorphism changes where we are pointing 
		Rate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();

	}

}
