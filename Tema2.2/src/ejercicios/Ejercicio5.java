package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el tipo de carnet del usuario
		String carnet;
		
		// Le pedimos al usuario el tipo de carnet
		System.out.println("Dime que tipo de carnet tienes:");
		carnet = sc.next().toUpperCase();
		
		// Usando el switch mostramos el tipo de carnet que tiene dependiendo de la respuesta anterior
		switch (carnet) {
			case "E" -> {
				System.out.println("El carnet es de tipo 'Remolque'");
			}
			case "D" -> {
				System.out.println("El carnet es de tipo 'Autobuses'");
			}
			case "C1", "C2", "C3", "C4", "C5" -> {
				System.out.println("El carnet es de tipo 'Camiones'");
			}
			case "A" -> {
			System.out.println("El carnet es de tipo 'Motocicletas'");
			}
			case "B1", "B2" -> {
				System.out.println("El carnet es de tipo 'Automoviles'");
			}
			default -> {
				System.out.println("Categoría no contemplada");
			}
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
