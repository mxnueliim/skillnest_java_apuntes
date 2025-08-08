package cl.skillnest;

import java.util.Scanner;

public class Presentacion {

	public static void main(String[] args) {
		/*
		 * Solicitar y mostrar sus datos personales
		 * Nombre, apellido, edad, dirección, correo
		 * Mostrar mensaje con toda la información
		 */
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese sus datos:");
		
		System.out.println("Nombre:");
		String nombre = scanner.nextLine();
		
		System.out.println("Apellido:");
		String apellido = scanner.nextLine();
		
		System.out.println("Edad:");
		int edad = scanner.nextInt();
		scanner.nextLine(); //esto limpia el buffer
		
		System.out.println("Dirección:");
		String direccion = scanner.nextLine();
		
		System.out.println("Correo:");
		String correo = scanner.nextLine();
		
		System.out.println("Te llamas "+nombre + " " + apellido+ " vives en "+direccion +
				", tienes "+edad + " años y tu correo es "+ correo);
		
		scanner.close();
	}
}
