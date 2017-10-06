package Labs;

public class Lab2 {
	public static void main(String[] args) {
		
		Student stu1 = new Student("Channel","545643286");
		//Student stu2 = new Student("Tony","435678676");
		//Student stu3 = new Student("Adam","543568936");
		
		
		stu1.enroll("Math151");
		stu1.enroll("English259");
		stu1.enroll("Algebra650");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuittion(600);
		//stu1.checkBalance();
		
		stu1.setPhone("6124334667");
		stu1.setCity("LA");
		stu1.setState("California");
		
		System.out.println(stu1.toString());

	}
}

class Student{
	//Properties 
	
	private static int iD=1000;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourses = 800;
	private int balance = 0;
	private String phone;
	private String city;
	private String state;
	
	//CONSTRUCTOR
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	private void setEmail() {
		email  = name.toLowerCase() + "." + iD + "@gmail.com";
		//System.out.println("Your email is : " + email);
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min) );
		userID = iD + "" + randNum + "" +ssn.substring(4, 8);
		//System.out.println("Your user id is: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourses;
		//System.out.println(courses);
	}
	
	public void payTuittion(int amount) {
		//System.out.println("Payment : $" + amount );
		balance = balance - amount;

	}
	
	public void checkBalance() {
		System.out.println("Balance $:" + balance);
	}
	
	public void showCourses() {
		System.out.println("Courses : " + courses );
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
		return "Student [userID=" + userID + ", name=" + name + ", ssn=" + ssn + ", email=" + email + ", courses="
				+ courses + ", balance=" + balance + ", phone=" + phone + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}


