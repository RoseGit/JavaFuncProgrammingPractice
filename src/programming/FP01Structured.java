package programming;

import java.util.Iterator;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Excersice 1
		//printAllNumbersInListStructured(numbers);
		
		//Excersise 2
		printEvenNumbersInListStructured(numbers);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//how to loop the numbers (traditional)
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//how to loop the numbers (traditional)
		for (int number : numbers) {
			if(number%2 == 0) {
				System.out.println(number);	
			}
		}
	}

}
