public class ArrayText8 {
	//Función para verificar si las cadenas empiezan por a o no
  static boolean verificacion(String palabra) {
	if (palabra.startsWith("a") || palabra.startsWith("A")) {
		return true;	
	}
	return false;
  }
	public static void main(String[] args) {
	String cadenas [] = {"Sue","Charlotte","anNa","aMIkE","WiLLiam","Ade"};
		int cantidad =0;
		//Bucle para contar cuantas palabras empiezan por a y también muestra que palabras son
		for (int i = 0; i<cadenas.length;i++) {
			if (verificacion(cadenas[i])) {
				cantidad ++;
				System.out.println(cadenas[i]);
			}
		}//Para mostrar el total de palabras encontradas que empiezan por a
		System.out.println("Se han encontrado un total de " + cantidad + " palabras que empiezan por a");
	}
}
