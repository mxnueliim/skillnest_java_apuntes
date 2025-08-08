package cl.skillnest;

public class Arreglos {

	public static void main(String[] args) {
		/*
		 * Un arreglo unidimensional en Java
		 *  (también llamado array de una dimensión) es una 
		 *  estructura que permite almacenar múltiples elementos 
		 *  del mismo tipo en una única variable indexada.
		 */
		int[] numeros = {1,3,5}; //arreglo unidimensional
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println(numeros); // entrega [I@816f27d [ arreglo I int @816f27d hash
		
		String[] vocales = {"a","e","i","o","u"};
		
		for (String vocal : vocales) {
			System.out.println(vocal);
		}
		
		int[][] matriz = {
				{1,2,3},
				{4,5,6}
		};

		for (int fila = 0; fila < 2 ; fila++) {
			for (int columna = 0; columna < 3 ; columna++) {
				System.out.println(matriz[fila][columna]);
			}
		}
		
		for (int fila = 0; fila < 2 ; fila++) {
			for (int columna = 0; columna < 3 ; columna++) {
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		
		for (int fila = 0; fila < matriz.length ; fila++) {
			for (int columna = 0; columna < matriz[fila].length ; columna++) {
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		
	}

}
