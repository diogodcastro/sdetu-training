package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account >> think instanciate an object 

		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger"; OLD WAY - PUBLIC VARIABLE
		// WITH ENCAPSULATION : public API methods
		acc1.setName("Roger Hue");
		acc1.setSsn("6456423");
		
		System.out.println(acc1.getName());
		System.out.println("SSN:" + acc1.getSsn());
		
		acc1.accountNumber = "015234356446756";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		//POLYMORPHISM though overriding
		System.out.println(acc1.toString());
		
		
		//POLYMORPHISM through Overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "015223456446756";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "015234223546756";
		acc3.checkBalance(); 
		
		/**
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
		*/
		

	}

}
