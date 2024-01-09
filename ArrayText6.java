public class ArrayText6 {
   static boolean polindromo(String palabra) {
   	//Para que convierta las letras en minúscula y todas sean iguales
    palabra = palabra.toLowerCase();	       
	    int longitud = palabra.length();
	    //para que vea las palabras de lado contrario
	    for (int i = 0; i < longitud / 2; i++) {
	    	//Para comparar las palabras de izquierda a derecha con las de orden inverso derecha a izquierda
	        if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
	            return false;
	        }
	    }
     return true;
   }
	public static void main(String[] args) {
	String cadenas [] = {"SUe","Charlotte","AnNa","MIkE","WiLLiam","Ede"};
	//Para poner un mensaje en pantalla diciendo cual es y no es palíndromo.
		for (int i = 0; i < cadenas.length; i++) {
	        if (polindromo(cadenas[i])) {
	            System.out.println(cadenas[i] + " es un palíndromo");
	        } else {
	            System.out.println(cadenas[i] + " no es un palíndromo");
	          }
	    }
	}
}
