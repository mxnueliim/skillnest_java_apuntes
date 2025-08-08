package cl.skillnest;

public class Cadenas {

	public static void main(String[] args) {
		String frase = "   Java Es GENIAL    ";

		//eliminar espacios al inicio y final
		String fraseSinEspacios = frase.trim();
		System.out.println("1. "+fraseSinEspacios);
		//convertir todo en minúscula
		String fraseEnMinuscula = frase.toLowerCase();
		System.out.println("2. "+fraseEnMinuscula);
		//obtener length de la frase limpia
		System.out.println("3. "+fraseSinEspacios.length());
		//verificar si viene la palabra genial
		Boolean contieneGenial = frase.contains("GENIAL");
		System.out.println("4. ¿Contiene GENIAL? "+contieneGenial);
		//reemplazar genial por poderoso
		String nuevaPalabra = frase.replace("GENIAL", "PODEROSO");
		System.out.println("5. "+nuevaPalabra);
		//imprimir en que posicion esta la palabra "es"
		int posicionEs = frase.indexOf("Es");
		System.out.println("6. "+posicionEs);
		int posicionEs2 = fraseSinEspacios.indexOf("Es");
		System.out.println("6.2 "+posicionEs2);
	}

}
