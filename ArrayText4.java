public class ArrayText4 {
public static int contarMayusculas(String palabra) {
   int contador = 0;
   //Bucle para ver qué caracteres de cada palabra son mayúsculas
   for (int i = 0; i < palabra.length(); i++) {
       char caracter = palabra.charAt(i);
       if (Character.isUpperCase(caracter)) {
              contador++;		   
       }
   }
   return contador;
}
	public static void main(String[] args) {
	String cadenas [] = {"SUe","Charlotte","AnNa","MIkE","WiLLiam","Ed"};	
	//Bucle para llamar la función y también para poner un mensaje en pantalla y encontrar las minúsculas
   	for (int i = 0; i < cadenas.length; i++) {
   		int contarMinusculas =0;
   		int contadorMayusculas = contarMayusculas(cadenas[i]);
   		//para encontrar la cantidad de minúsculas
   		contarMinusculas= cadenas[i].length()- contadorMayusculas; 
   		//Para poner un mensaje en pantalla.
   		//En este ejercicio solo pedias lo de las mayúsculas pero yo te muestro en pantalla
   		//que cosa hay más en cada una de las palabras o si hay la misma cantidad.
   		if (contadorMayusculas > contarMinusculas) {
   		System.out.println("Hay mayor cantidad de mayúsculas en la posición " + i +
   				" con un total de : " + contadorMayusculas + " Mayusculas y " + contarMinusculas +
   				 " minúsculas");
   		} else if (contadorMayusculas < contarMinusculas) {
               System.out.println("Hay mayor cantidad de minúsculas en la posición " + i +
       				" con un total de : " + contarMinusculas + " minúsculas y " + contadorMayusculas +
      				 " mayúsculas");
           } else {
               System.out.println("Hay la misma cantidad de mayúsculas (" + contadorMayusculas +
               		") como minúsculas (" + contarMinusculas + ") en la posición " + i );
           }
   	}
	}
}
