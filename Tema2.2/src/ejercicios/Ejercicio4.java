package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el resultado de la primera tirada introducida por el usuario
		String tirada1;
		
		// Variable donde guardaremos el resultado de la segunda tirada introducida por el usuario
		String tirada2;
		
		// Variable donde guardaremos el resultado de la primera tirada en valor númerico
		int valor1;
		
		// Variable donde guardaremos el resultado de la segunda tirada en valor númerico
		int valor2;
		
		// Le pedimos al usuario el valor de la primera tirada
		System.out.println("Dime el valor de la tirada 1:");
		tirada1 = sc.next().toUpperCase();
		
		// Le pedimos al usuario el valor de la segunda tirada
		System.out.println("Dime el valor de la tirada 2:");
		tirada2 = sc.next().toUpperCase();
		
		// Le damos el valor númerico a la primera tirada usando el switch
		valor1 = switch (tirada1) {
			case "UNO" -> 1;	
			case "DOS" -> 2;
			case "TRES" -> 3;
			case "CUATRO" -> 4;
			case "CINCO" -> 5;
			case "SEIS" -> 6;
			default -> 0;
		};
		
		// Le damos el valor númerico de la segunda tirada usando el switch
		valor2 = switch (tirada2){
			case "UNO" -> 1;	
			case "DOS" -> 2;
			case "TRES" -> 3;
			case "CUATRO" -> 4;
			case "CINCO" -> 5;
			case "SEIS" -> 6;
			default -> 0;
		};

		// Mostramos el resultado de la suma de las dos tiradas en caso de que se haya introducido correctamente los dos valores
		if (valor1 != 0 && valor2 != 0 ) {
			System.out.println("La suma de las dos tiradas sería de: " + (valor1 + valor2));
		// En caso de que no se haya introducido correctamente los valores mostraremos un mensaje de error
		} else {
			System.err.println("Error al introducir el valor de las tiradas");
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
