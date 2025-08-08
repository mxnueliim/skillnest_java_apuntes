package cl.skillnest;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
		/*
		 * Inicio
		   Leer A, B
		   Resultado = A + B
		   Imprimir Resultado
			Fin
		 */
		
		//se esta creando una variable y una nueva instancia del objeto Scanner
		Scanner scanner= new Scanner(System.in);
		
		//paso 1 - entrada de datos
		System.out.println("Ingrese el primer número:");
		
		//paso 2 - lectura / creando variable númerica
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingrese el primer número:");
		int numero2 = scanner.nextInt();
		
		int resultado = numero1 + numero2;
		
		//paso 3 - resultado
		System.out.println("El valor final es: "+resultado);
		//aqui los interpreta como string
		System.out.println("El valor final es: "+numero1+numero2);
		
		//aqui los interpreta como numero
		System.out.println("El valor final es: "+ (numero1+numero2));
		
		//aqui se esta cerrando, por lo que no se podrá ocupar en lineas posteriores
		scanner.close();
	}
}
