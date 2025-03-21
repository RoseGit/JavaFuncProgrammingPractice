package programming;

import java.util.Iterator;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//What to do ? 
		//1.Crear un stream con la coleccion que vamos a trabajar
		//2. Que vamos a hacer con cada elemento ?(forEach)
		//3. Llamar al metodo de impresion de numero sin argumentos porque es lo que recibe, lo proporciona forEach  
		System.out.println("Primer acercamiento");
		numbers.stream().forEach(FP01Functional::printNumber);//::(Method reference)
		
		System.out.println("Mejorando el proceso");
		//Sin embargo una mejor aproximacion del codigo anterior es este 
		numbers.stream().forEach(System.out::println);
	}

	private static void printNumber(int number) {
		System.out.println(number);
	}
}
