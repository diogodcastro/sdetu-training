package basics;

public class FibonacciApp {
	public static void main(String[] args){
		//Fibonacci number is define by the sum of the 2 previous numbers
		//Fib(0) = 0
		//Fib(1) = 1
		//Fib(2) = Fib(0) + Fib(1) = 0 + 1 = 1
		//Fib(3) = Fib(1) + Fib(2) = 1 + 1 = 2
		//Fib(4) = Fib(2) + Fib(3) = 1 + 1 = 3
		//Fib(5) = Fib(3) + Fib(4) = 1 + 1 = 5

		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		
		/**
		 * 1! = 1 * 1
		 * 2! = 2 * 1
		 * 3! = 3 * 2 * 1 
		 * 4! = 4 * 3 * 2 * 1
		 */
		
		for (int j = 0; j<=10; j++){
			System.out.println(j + "! " + fac(j));
		}
		
		for(int y=1; y<=5; y++){
			System.out.println(returnSum(y));
		}
		
		
	}
	
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		return ((fib(n-1)) + (fib(n-2)));
	}
	
	/**
	 * função para calcular os numeros fatoriais
	 * @param c
	 * @return
	 */
	public static int fac(int c){
		
		if (c <=1 ){
			return 1;
		}
		else {
			return c * fac(c-1);
		}
	}	
	
	/**
	 * Função para somar valores de X ate 1
	 * @param x
	 * @return
	 */
	public static int returnSum(int x){
		if(x==0){
			return 0;
		}
		else{
			return x + returnSum(x-1);
		}
	}
	
	
}
