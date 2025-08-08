package cl.skillnest;

public class CondicionalYBucle {

	public static void main(String[] args) {
		// Condicionales
		
		boolean verdad = true;
		
		if (verdad == true) {
			System.out.println("Hola");
		}
			
		int numero1= 5;
		
		if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
		/*
		 * Switch
		 */
		switch (numero1) {
		case 1:
			System.out.println("Es lunes");
			break;

		default:
			System.out.println("Indeterminado");
			break;
		}
		
		/*
		 * For
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

}
