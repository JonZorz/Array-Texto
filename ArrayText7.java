public class ArrayText7 {
	//Función que verifica si las cadenas tienen la subcadena zar
     static boolean verificar(String palabra, String cosa) {
	      palabra = palabra.toLowerCase();	
	       for(int i = 0; i < palabra.length(); i++) {	    	  
		    	if(palabra.contains(cosa)) {
		        return true;		       
		    	}	    	 
	       }
		return false;     	 
     }
 public static void main(String[] args) {
 String cadenas [] = {"Sue","Charlottezar","AnNaZar","MIkE","WiLLiam","Ede"};
 int resultado = 0;
 //Bucle para sumar y poner en pantalla las palabras y el resultado que tienen la subcadena zar
	 for(int i = 0; i < cadenas.length; i++) {
		 if (verificar(cadenas[i], "zar")) {
			resultado++;
		    System.out.println("Se ha encontrado una palabra que contiene la subcadena zar " +
			" y está en la posición " + i + " y es " + cadenas[i]);
		 }else System.out.println("En la cadena " + i + " no se ha encontrado la subcadena zar");			
	 }System.out.println("En total se han encontrado " + resultado + " palabras que tienen la subcadena zar");
 }
}
