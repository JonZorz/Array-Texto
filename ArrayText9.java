public class ArrayText9 {
  static void encontrarMaxCaracteres(String[] cadenas) {
   int maxCaracteres = 0;
   String cadenaMax = "";
       //Bucle para comparar las cadenas y encontrar la que tiene más caracteres
	    for (int i = 0; i < cadenas.length; i++) {
	        int longitudActual = cadenas[i].length();
	        if (longitudActual > maxCaracteres) {
	            maxCaracteres = longitudActual;
	            cadenaMax = cadenas[i];
	        }
	    }
	    //Para poner un mensaje en pantalla diciendo cuál es la cadena más larga
	    System.out.println("La cadena con más caracteres es: " + cadenaMax);
	    System.out.println("Número de caracteres: " + maxCaracteres);
   }
	public static void main(String[] args) {
   String cadenas [] = {"Sue","Charlotte","anNa","aMIkE","WiLLiam","Ade"};
   //Para llamar la función
	encontrarMaxCaracteres(cadenas);		
	}
}
