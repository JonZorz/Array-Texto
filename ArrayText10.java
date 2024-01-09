public class ArrayText10 {
	// Función que cuenta las palabras repetidas
	static int contarRepetidas(String[] Array) {
	    int contador = 0;
	    for (int i = 0; i < Array.length; i++) {
	        for (int j = i + 1; j < Array.length; j++) { //Dos bucles para poder   comparar las palabras
	        	//del Array
	            if (Array[i].equalsIgnoreCase(Array[j])) {
	                contador++;
	                System.out.println(Array[i] + " " + Array[j]);
	            }
	        }
	    }
	    return contador;
	}
	public static void main(String[] args) {
       String cadenas[] = {"Sue", "Charlottezar", "AnNaZar", "MIkE", "MIkE", "AnNaZar"};
       //Para llamar la función y mostrar el mensaje en pantalla
	        int cantidadRepetidas = contarRepetidas(cadenas);
	        System.out.println("En total se han encontrado " +
	        cantidadRepetidas + " palabras repetidas en esta tabla.");
	}
}
