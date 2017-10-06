package basics;
import java.util.*;
public class ArrayExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		array[0]=1;
		array[1]=4;
		array[2]=6;
		array[3]=7;
		array[4]=12;
		
		System.out.println(returnMinimum(array));
		System.out.println(returnMaximum(array));
		System.out.println(returnAverage(array));
	}
	public static int returnMinimum(int[] array){
		return Arrays.stream(array).min().getAsInt();
	}
	public static int returnMaximum(int[] array){
		return Arrays.stream(array).max().getAsInt();
	}
	public static double returnAverage(int[] array){
		return Arrays.stream(array).average().getAsDouble();
	}

}
