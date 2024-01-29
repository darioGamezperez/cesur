package practicas;

public class holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hola mundo";
		
		for (int indice=0; indice< cadena.length(); indice++) {
			if (indice%2==0) {
				System.out.println(cadena.toUpperCase().charAt(indice)); 
			} else {
				System.out.println(cadena.toLowerCase() .charAt(indice)); 
			}
			
			
		}

	}

}
