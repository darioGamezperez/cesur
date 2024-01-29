package practicas;
import java.util.Scanner;
public class palindromo {

	public static void main(String[] args) {
	Scanner	teclado = new Scanner(System.in);
	char[] cadena = teclado.nextLine().toCharArray();
		//longitud par
	int j= cadena.length;
	boolean noEs= true;
	for (int i=0; i<(cadena.length/2) ;i++) {
		j--;
		if (cadena[i]!=cadena[j]) {
			noEs = false;
		}
	}
	}
		}

