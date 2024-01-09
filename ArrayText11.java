public class ArrayText11 {
	static void encontrarMaxVocales(String[] cadenas) {
       int maxVocales = 0;
       String cadenaMax = "";
       // Bucle para comparar las cadenas y encontrar la que tiene más vocales
       for (int i = 0; i < cadenas.length; i++) {
           int vocalesActuales = 0;
           for (int j = 0; j < cadenas[i].length(); j++) {
               char letra = Character.toLowerCase(cadenas[i].charAt(j));
               // Verificar si la letra es una vocal
               if ("aeiou".indexOf(letra) != -1) {
                   vocalesActuales++;
               }
           }          //Para ir guardando los valores
		            if (vocalesActuales > maxVocales) {
		                maxVocales = vocalesActuales;
		                cadenaMax = cadenas[i];
		            }
       }
       // Para poner un mensaje en pantalla diciendo cuál es la cadena con más vocales
       System.out.println("La cadena con más vocales es: " + cadenaMax);
       System.out.println("Número de vocales: " + maxVocales);
   }	
	public static void main(String[] args) {
	 String cadenas [] = {"Sue","Charlotte","anNa","aMIkEee","WiLLiam","Ade"};
    encontrarMaxVocales(cadenas);
	}
}
