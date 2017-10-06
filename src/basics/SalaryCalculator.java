package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		//create a variable to define our career
		
		//declare variable 
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software developer";
		System.out.println("My career is: "+ career);
		
		//declare & define a variable 
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.print("My salary as a "+ career + " as a rate of $" + rate +" per hour is $ " + salary + " per year.");
		
		
		//Compute our annual salary
		
		//Rate x hoursPerWeek x weeksPerYear
	}
}
