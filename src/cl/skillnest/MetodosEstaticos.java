package cl.skillnest;

public class MetodosEstaticos {
	//static: ACCESADOR void: tipoRetorno nombreMetodo (tipoDato nombreParametro)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retorno = sumaDosNumeros(10, 20);
		System.out.println(retorno);
		System.out.println(sumaDosNumeros(10, 30)); // 40
		
		restaDosNumero(50,10);
		restaDosNumero(50,10,20);
	
	}
	
	//método estático
	public static int sumaDosNumeros(int num1, int num2){
		int resultado = num1 + num2;
		return resultado;
	   }

	public static void restaDosNumero(int num1, int num2) {
		System.out.println("la resta de dos numeros es: " + (num1-num2));
	}
	
	//Sobrecarga de métodos
	public static void restaDosNumero(int num1, int num2, int num3) {
		System.out.println("la resta de tres numeros es: " + (num1-num2-num3));
	}
}
