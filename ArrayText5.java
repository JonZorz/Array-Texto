public class ArrayText5 {
	static String convertirMayuscula(String palabra) {
		String resultado = "";
		//Bucle para ver las letras de cada palabra
		for (int i = 0; i < palabra.length(); i++) {
			char caracter;
	         caracter = palabra.charAt(i);
	         //Si la letra es minúscula la convierte en mayúscula
	        if (Character.isLowerCase(caracter)) {
	           caracter= Character.toUpperCase(caracter);        
	        }
	        resultado += caracter;
	    }
		return resultado;	    	
	}
	public static void main(String[] args) {
	String cadenas [] = {"SUe","Charlotte","AnNa","MIkE","WiLLiam","Ed"};
		//Para llamar la función y mostrar el mensaje en pantalla
		for (int i = 0; i < cadenas.length; i++) {
		String resultado=convertirMayuscula(cadenas[i]);
		System.out.println(resultado);	
		}
	}
}
