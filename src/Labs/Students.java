package Labs;

import java.util.ArrayList;
import java.util.List;

public class Students {

	public static void main(String[] args) {
		StudentsDB stu1 = new StudentsDB("Obama", "45672340");
		//StudentsDB stu2 = new StudentsDB("Hilary", "62376440");
		
		stu1.setPhone("909449413");
		stu1.setCity("LA");
		stu1.setState("Florida");
		
		stu1.addClass("Math");
		stu1.addClass("Algebra");
		
		System.out.println(stu1.toString());
		
	}
}
	
class StudentsDB{
	private static int iD = 1000;				
	private final String name;
	private final String SSN;
	private String userID;
	private String email;
	private String phone;
	private String city;
	private String state;
	private double balance = 1000;
	private List<String> classes = new ArrayList<String>();



public StudentsDB(String name, String SSN){
	this.name = name;
	this.SSN = SSN;
	System.out.println("New student created on DB.");
	email = name + "." + iD + "@gmail.com";
	user();
	iD++;
}

public void user(){
	int random = (int) (Math.random()*10000);
	this.userID = iD + "" + random + "" +SSN.substring(4, 8);
	System.out.println(name + " your userID is: " + userID);
	
}
public void enroll(){
	//didn't understand what was suposed to do here
}

public void pay(double amount){
	balance = balance - amount;
}

public void deposit(double amount){
	balance = balance + amount;
}

public void checkBalance(){
	System.out.println("Your account balance is :" + balance);
}

public List<String> showCourses(){
	return this.classes;
}

public void addClass(String nameClasse) {
	this.classes.add(nameClasse);
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "StudentsDB [name=" + name + ", SSN=" + SSN + ", userID=" + userID + ", email=" + email + ", phone=" + phone
			+ ", city=" + city + ", state=" + state + ", balance=" + balance + ", classes=" + classes + "]";
}


}
