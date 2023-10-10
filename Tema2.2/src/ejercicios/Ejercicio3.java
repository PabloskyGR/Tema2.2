package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Varibale donde guardaremos el primer número introducido
		double num1;
		
		// Variable donde guardaremos el segundo número introducido
		double num2;
		
		// Variable donde guardaremos el resultado de ls suma de los números
		double suma;
		
		// Variable donde gaurdaremos el resultado de la resta de los números
		double resta;
		
		// Variable donde guardaremos el resultado de la multiplicación
		double mult;
		
		// Variable donde guardaremos el resultado de la división
		double div;
		
		// Varibale donde guardaremos la acción que quiera hacer el usuario en el menú
		String menu;
		
		// Le pedimos al usuario dos números
		System.out.println("Dime 2 números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Le mostramos al usuario el menú y le pedimos que quiere hacer
		System.out.println("Dime que quieres hacer:");
		System.out.println(" - - - - - - - - - - - - - - - ");
		System.out.println("| A. SUMAR LOS NÚMEROS        | \n"  +
						   "| B. RESTAR LOS NÚMEROS       | \n"  +
						   "| C. MULTIPLICAR LOS NÚMEROS  | \n"  +
						   "| D. DIVIDIR LOS NÚMEROS      |");
		System.out.println(" - - - - - - - - - - - - - - - ");
		menu = sc.next().toUpperCase();
		
		// Calculamos la suma de los números
		suma = num1 + num2;
		
		// Calculamos la resta de los números
		resta = num1 - num2;
		
		// Calculamos la multiplicación de los números
		mult = num1 * num2;
		
		// Calculamos la división de los números
		div = num1 / num2;
		
		// Usando el switch mo0stramos el resultado de lo que haya elegido el usuario
		switch (menu) {
		case "A":
			System.out.println("La suma de " + num1 + " + " + num2 + " es de: " + suma);
			break;
		case "B":
			System.out.println("La resta de " + num1 + " + " + num2 + " es de: " + resta);
			break;
		case "C":
			System.out.println("La multiplicación de " + num1 + " + " + num2 + " es de: " + mult);
			break;
		case "D":
			System.out.println("La división de " + num1 + " + " + num2 + " es de: " + div);
			break;
		default:
			System.out.println("Opción no válida");
		}
		
		// Cerramos el scanner
		sc.close();
		

	}

}
