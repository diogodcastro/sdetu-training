package oop;

public class BankAccount implements Rate {
	//define variables
	String accountNumber;
	
	//static >> belongs to the CLASS not the object instance
	//final >> constance : often static final 
	//INSTANCE VARIABLES
	private static final String routingNumber = "013456";
    private String name;
	private String ssn;

	String accountType;
	double balance = 0;
	
	//Constructor definition : unique methods
		//use to
		// 1. define to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITY called upon an INSTANTIATION
		// 3. the same name as the CLASS it self
		// 4. Constructors have no return type at all
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading : call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+ accountType);
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, msg are all local variables
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("Initial deposit: "+ initDeposit);
		String msg = "";
		if(initDeposit < 1000){
			msg = "ERROR: Mininum deposit must be at least $1,000";
		}
		else{
			msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;
	}
	
	//Getters & Setters
	
	// Allow the user to define the name
	
	public void setName(String name){
		this.name = "Mr."+ name;
	}
	public String getName(){
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Interface methods
	
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", ssn=" + ssn + ", accountType="
				+ accountType + ", balance=" + balance + " RoutingNumber="+ routingNumber +"]";
	}
	
	//private can only be called from within the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	//Define methods
	public void deposit(double amount){
		this.balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		this.balance = balance - amount;
		showActivity("WITHDRAW");
	}
	

	
	void checkBalance(){
		System.out.println("Balance :" + balance);
	}
	
	void getStatus(){
		
	}
	
}
