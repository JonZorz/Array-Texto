public class ArrayText3 {
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
		String[] cadenas= {"SUe","Charlotte","AnNa","Mike","WiLLiam","Ed"};	
		//Bucle para llamar la función y también para poner un mensaje en pantalla
       for (int i = 0; i < cadenas.length; i++) {
           int contadorMayusculas = contarMayusculas(cadenas[i]);
           System.out.println("Cantidad de mayúsculas en la posición " + i +
           ": " + contadorMayusculas);
       }
   		
	}
}
