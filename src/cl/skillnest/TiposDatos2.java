package cl.skillnest;

import java.util.ArrayList;

public class TiposDatos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// autoboxing > es convertir un primitivo a variable tipo objeto
		int numero = 38; //variable primitiva
		Integer numeroObjeto = numero; //aqui ya es variable objeto
		
		//numeroObjeto. > aqui ya se pueden ocupar funciones
		
		
		
		//Unboxing objeto a primitivo
		int numero2 = numeroObjeto;
		
		System.out.println("El numero primitivo: "+numero);
		System.out.println("El numero objeto: "+numeroObjeto);
		System.out.println("El Umboxing: "+numero2);
		
		/*
		 * wrapper
		 */
		
		String texto = "1234";
		int numero3 = Integer.parseInt(texto); 
		String texto2 = String.valueOf(numero3); //3 formas de como abordar una conversion
		Integer numero4 = Integer.parseInt(texto2);
		String texto3 = numero4.toString();
		
		System.out.println("Texto 1: "+texto);
		System.out.println("Texto 2: "+texto2);
		System.out.println("Texto 3: "+texto3);
		
		double decimal = Double.parseDouble("8.8");
		System.out.println("El decimal: "+decimal);
		boolean existe = Boolean.parseBoolean("tRUe"); //si agrego otro valor arroja false
		System.out.println("Existe? "+existe);
		
		/*
		 * ArrayList >> es una coleccion de un tipo de dato
		 */
		
		ArrayList<Integer> listaNumeros = new ArrayList<>(); //aqui se define un arreglo, no se pueden poner primitivos
		System.out.println("arreglo vacio"+listaNumeros);
		System.out.println("arreglo vacio, tamaño: "+listaNumeros.size());
		listaNumeros.add(5); // agrega al final del arreglo
		System.out.println("arreglo con el numero agregado: "+listaNumeros);
		System.out.println("tamaño nuevo: "+listaNumeros.size());
		
		//recorrer arreglo
		for (Integer elemento : listaNumeros) {
			System.out.println("El elemento " + elemento);
		}
		
		/***************** comparaciones ******************/
		//en no primitivas se ocupa equals para comparar
		int numeroA = 100;
		int numeroB = 100;
		
		System.out.println(numeroA == numeroB); //compara valores
		
		Integer numeroC = 200;
		Integer numeroD = 200;
		
		System.out.println(numeroC == numeroD); //comparacion de objeto > es si apuntan al mismo espacio de memoria
		System.out.println(numeroC.equals(numeroD)); //aqui arroja true
		
		String nombre = "Israel";
		String name= "Israel";
		
		System.out.println("== ." + nombre == name);//
		System.out.println("equals "+ name.equals(nombre));//
		
		/***************** valores por default ******************/
		//sino inicializaoms una variable lo podemos hacer por boton y agrega un valor null
		
		int edad = 0;
		System.out.println("la edad es: "+ edad); // imprime vacio
		
		char letra = 0;
		System.out.println("la letra es: "+ letra); // imprime 0
		
		boolean valor = false;
		System.out.println("El de verdad es: "+ valor); // imprime false
	}

}
