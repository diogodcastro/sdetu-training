package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking!");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping!");
	}
}


public class Demo {

	public static void main(String[] args) {
		
		//instantiating an object
		Person person1 = new Person();
		
		//define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "23465476";
		
		//abstraction
		person1.walk();
		
		//create a new person
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "657567876";
		
		person2.sleep();
		// person
		/*
		//Atributes, variables, adjetives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "23465476";

		//action, activity, behavior
		System.out.println(name + " is walking!");
		System.out.println(name + " is eating!");
		
		//another person
		//Atributes, variables, adjetives, descriptors
		String name2 = "Sarah";
		String email2 = "Sarah@testemail.com";
		String phone2 = "765632314";

		//action, activity, behavior
		//System.out.println(name2 + " is walking!");
		walking(name2);
		System.out.println(name2 + " is eating!");
		
		//what about binding atributes and properties together 
		
	}
	//enhance by adding funtions to minimize code
	static void walking(String name){
		System.out.println(name + " is walking!");
		*/
		
		
		
	}
	
		
}
