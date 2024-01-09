public class ArrayText2 {
static int posicionAlfabetica(String Array[]) {
 //Bucle para ver cuál palabra empieza por la letra a que es la primer letra en orden alfabético
	for(int i=0; i<= Array.length -1; i++) {
	  if ( Array[i].toLowerCase().startsWith("a")) {
		  return i;	
	  }  		
	}
	return -1; 	
}
public static void main(String[] args) {
 String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};		
   int posicion = posicionAlfabetica(cadenas);
   //Para decir si hay o no hay una palabra que empieza por a y decir su posición
	  if (posicion != -1) {
       System.out.println("La cadena encontrada en orden alfabético se encuentra en la posición " + posicion);
     } else {
       System.out.println("No hay ninguna cadena que cumpla la condición.");
       }
}
}
