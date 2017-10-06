package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("34556796", 1000.50);
		//BankAccount acc2 = new BankAccount("36676796", 2000);
		//BankAccount acc3 = new BankAccount("45656796", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		
		acc1.accrue();
		
		System.out.println(acc1.toString());
	}
}


class BankAccount implements Interest{
	//Properties of bank account
	//Encapsulation usado para tornar as variaveis privadas
	private static int iD = 1000;
	private String name;
	private String SSN;
	//private final String routingNumber = "345446476";
	private String accountNumber;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	private void setAccountNumber(){
		int random = (int) (Math.random()*100); //Metodo Math ja existente, cast to int pq return double e * 10 para serem 2 digitos
		accountNumber = iD + "" + random +  SSN.substring(0, 2);
		System.out.println("Your account number is : " + accountNumber );
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void payBill(double amount){
		balance = balance - amount;
		System.out.println("Paying bill : " + amount);
		showBalance();
	}
	public void makeDeposit(double amount){
		balance = balance + amount;
		System.out.println("Making deposit : " + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100);//ERRO POR ESCREVER SO RATE! PK ?
		showBalance();
	}


}