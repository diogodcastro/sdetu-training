package basics;

public class Cities {

	public static void main(String[] args) {
		// declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
				
		//declare array
		String[] countries;
		
		//define array;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		
		System.out.println("***************************************************");
		
		//Declare and define array (only the size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		do{ //Do Loop enters the loop then tests condition
			System.out.println("STATE : " +states[i]);
			i++;
		} while( i < states.length);
		
		System.out.println("*************************************************** \n");
		
		// While Loop tests condition first than do the Loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound){
			String state = states[n];
			System.out.println(state);
			if(state == "Texas"){
				System.out.println("STATE found");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("*************************************************** \n");
		
		// For Loop : the best structure for iterating through an array 
		for(int j=0; j < states.length; j++){
			System.out.println("STATE [for Loop] : " +states[j]);
		}
		
	}

}
