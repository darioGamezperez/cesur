
public class contadorInverso {
//Vamos a ir de 1200 a 620 contando de 20 en 20 usando while y for

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		numero = 1200;
		while (numero > 600) {
			System.out.print(numero + " ");
			numero = numero -20;
			
		}
		System.out.println();
		numero = 1200;
		do {
		System.out.print(numero + " ");
		numero = numero -20;
		} while (numero > 600);
		System.out.println();

		for (int num=1200; num>600; num=num-20) {
			System.out.print(num + " ");
			
		}
	}

}
