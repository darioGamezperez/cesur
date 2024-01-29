package practicas;
import java.util.Scanner;

public class ordenarTresNumeros {

	public static void main(String[] args) {
		Scanner teclado;
		teclado=new Scanner(System.in);

		System.out.println("Introduce, numero 1:");
		int num1=teclado.nextInt();
		System.out.println("Introduce, numero 2:");
		int num2=teclado.nextInt();
		System.out.println("Introduce, numero3:");
		int num3=teclado.nextInt();
		
		if(num1>=num2 || num1>=num3) {
			 System.out.print(num1);
		}
		

	}

}
