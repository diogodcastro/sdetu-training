package basics;

public class Weather {
	public static void main(String[] args){
		//suggestions of what to wear based of the weather (temperature) + sun condition
		
		int temperature = 65; //85, 60, 20
		String sunCondition = "Overcast";
		
		if(temperature > 80){
			System.out.println("It's pleasent. Wear shorts and t-shirt!");
		}
		else if((temperature > 60) && (sunCondition != "Sunny")){
			System.out.println("It's a little cooler. Perhaps  wear a long-sleeve shirt and jeans!");
			System.out.println("Wear a hat to block the sun!");
		}
		else if((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("This is a cold day. Make sure to wear warmer clothes.");
			
		}
		else{
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		System.out.println("The program is ending.");
	}
}	
