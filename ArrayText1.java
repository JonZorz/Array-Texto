
public class ArrayText1 {
   static void gurdarCantidad(String[] Array, int[] huecos) {
   	//bucle para guardar la cantidad de caracteres de cada nombre en una tabla
		for(int i=0; i <Array.length; i++) {		
		 huecos[i] = Array[i].length();
		 System.out.println(Array[i] + " tiene un total de : "  + huecos[i] + " caracteres");
		}
	}
	public static void main(String[] args) {
		String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};	
		int[] longitud= new int[cadenas.length]; //cadena para guardar los caracteres
			
			gurdarCantidad(cadenas, longitud);
	}	
}
