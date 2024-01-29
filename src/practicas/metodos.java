package practicas;
import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {
		Scanner teclado;
		int valor;
		int max;
		int min;
		teclado=new Scanner(System.in);

		System.out.println("Introduce, max:");
		max=teclado.nextInt();
		System.out.println("Introduce, min:");
		 min=teclado.nextInt();
		System.out.println("Introduce, valor:");
		 valor=teclado.nextInt();


System.out.println("Es cierto que el valor " + valor + " esta entre " + min + " y " +max);
System.out.println(metodos.comprobarValor(max, min, valor));
	}

	static boolean comprobarValor(int max, int min, int valor) {
		if (valor>=min && valor<=max ) {
			return true;
		} else {
			return false;
		}
	}

}
