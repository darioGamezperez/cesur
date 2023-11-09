import java.util.Scanner;

public class Dias_semanas {
	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.print("introduzca un numero entre 1 y 365: ");
		int totalDias=teclado.nextInt();
		System.out.println(totalDias);
		int diaSemana = 0;
		int semana = 0;
		int mes = 0;
		while (mes < 12) {
			while (semana < 4) {

				while (diaSemana < 7) {
					if (diaSemana == 0) {
						System.out.print("[L" + " ");
					} else if (diaSemana == 1) {
						System.out.print("M" + " ");
					} else if (diaSemana == 2) {
						System.out.print("X" + " ");
					} else if (diaSemana == 3) {
						System.out.print("J" + " ");
					} else if (diaSemana == 4) {
						System.out.print("V" + " ");
					} else if (diaSemana == 5) {
						System.out.print("S" + " ");
					} else if (diaSemana == 6) {
						System.out.print("D]" + " ");
					}
					diaSemana = diaSemana + 1;

				}
				semana = semana + 1;
				diaSemana = 0;
				
			} 
			System.out.println();
			semana = 0;
			mes= mes + 1;
		}
	}

}
