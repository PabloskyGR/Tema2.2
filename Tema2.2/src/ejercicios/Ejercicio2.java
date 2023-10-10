package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número introducido por el usuario
		int dia;
		
		// Le pedimos al usuario un número entre el 1 y el 7
		System.out.println("Dime un número del 1 al 7:");
		dia = sc.nextInt();
		
		// Con un switch mostramos a que dia de la semana pertenece el número introducido
		switch (dia) {
		case 1: 
			System.out.println("El número " + dia + " pertenece al día Lunes");
			break;
		case 2:
			System.out.println("El número " + dia + " pertenece al día Martes");
			break;
		case 3:
			System.out.println("El número " + dia + " pertenece al día Miécoles");
			break;
		case 4:
			System.out.println("El número " + dia + " pertenece al día Jueves");
			break;
		case 5:
			System.out.println("El número " + dia + " pertenece al día Viernes");
			break;
		case 6:
			System.out.println("El número " + dia + " pertenece al día Sábado");
			break;
		case 7:
			System.out.println("El número " + dia + " pertenece al día Domingo");
			break;
		default:
			System.out.println("Número introducido no es correcto");
		}

		// Cerramos el scanner
		sc.close();
	}

}
