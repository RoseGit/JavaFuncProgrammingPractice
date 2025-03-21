package programming;

import java.util.Iterator;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//how to loop the numbers (traditional)
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
