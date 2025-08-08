package cl.skillnest;

public class TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En Java, una variable es una referencia
		 * a un espacio de memoria que contiene un valor.
		 * Debe declararse con un tipo de dato.
		 */
		
	//tipos de datos primitivos
		int edad = 10; //int entero
		double altura = 1.79; //decimal ocupa . en java la , separa elementos
		boolean estaPresente = true; //valor booleano, tiene comportamiento lógico v/f 
		char vocal = 'a'; //char caracteres individuales, 1 solo caracter con comillas simples
		//byte -128 a 127
		//short -32 a ...
		//int 
		//float
		float precio = 1234.5f; // para double = numero decimal 
			//float = numero decimal.f para demostrar que es decimal
		//double
		//long
		long NumeroGrande = 1234567894654654659L; 
		
		/*
		 * Tipo String
		 */
		String nombre = "Manuel";
			//nombre.metodo
		Integer numero1 = 1231231;
			//numero1.metodo
		
		System.out.println("int edad = "+ edad);
		System.out.println("double altura = "+ altura);
		System.out.println("Está presente? = "+ estaPresente);
		System.out.println("La vocal escogida es = "+ vocal);
		System.out.println("El precio es = "+ precio);
		System.out.println("Número = "+ NumeroGrande);
		System.out.println("Mi nombre es = "+ nombre);
		System.out.println("Número = "+ numero1);
	}

}
