package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el valor de la nota del usuario
		int nota;
		
		// Le pedimos la nota al usuario
		System.out.println("Dime tu nota:");
		nota = sc.nextInt();
		
		// Usamos un switch para mostrar la calificació que tiene dependiendo de la nota que haya obtenido
		switch (nota) {
			case 0, 1, 2, 3, 4 -> {
			System.out.println("INSUFICIENTE");
			}
			case 5 -> {
			System.out.println("SUFICIENTE");
			}
			case 6 -> {
			System.out.println("BIEN");
			}
			case 7, 8 -> {
			System.out.println("NOTABLE");
			}
			case 9, 10 -> {
			System.out.println("SOBRESALIENTE");
			}
			default -> {
			System.out.println("Nota no válida");
			}
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
