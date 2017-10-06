package basics;


public class Lab1 {

	public static void main(String[] args) {
		// function takes N and return the sum 1 to N
		System.out.println(sum(5));
	    
		System.out.println("************************ \n");
		
		// funtion that computes factorial (recursion)
		System.out.println(fact(5));
		System.out.println("************************ \n");
		
		// 3 functions that write the min, max, aveg, of an array
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Print minimum: " + findMin(numbers));
		System.out.println("Print maximum: " + findMax(numbers));
		System.out.println("Print Average: " + findAvg(numbers));
	}
	
	public static int sum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}

	public static int fact(int n){
		if( n == 0){
			return 1;
		}
		else {
			return fact(n-1)*n;
		}
	}
	
	public static int findMin(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}	
		return min;
	}
	
	public static int findMax(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}	
		return max;
	}
	
	public static int findAvg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
}
