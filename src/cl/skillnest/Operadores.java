package cl.skillnest;

public class Operadores {

	public static void main(String[] args) {
		// Operadores aritmeticos
		
		int numero1 = 14, numero2 = 3;
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		double division = numero1 / numero2;
		double division2 = (float)numero1 / numero2;
			//si se trabaja con entero, deberia dar entero ej: 14/3 = 4
			// double division = (double) numero1 / numero2; 14/3 =4.6666666667
			// double division2 = (float)numero1 / numero2; 14/3 =  4.666666507720947

		System.out.println(suma + resta + multiplicacion + division);
		System.out.println("Suma "+suma);
		System.out.println("Resta "+resta);
		System.out.println("Mult "+multiplicacion);
		System.out.println("Div "+division);
		System.out.println("Div 2 "+division2);
		
		int modulo = numero1 % numero2;
		System.out.println("Modulo o resto de dividir es: "+modulo);
	}

}
