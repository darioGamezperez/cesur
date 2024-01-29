package alumnoCesur;

public class Fiboanaci {
	
public static void main(String[] args) {
	int maxNumFib = 100;
	int contador=0;
	int numActual=1;
	int numAnterior=1;
	int temp=0;
			

	System.out.print(numActual+ " ");
	System.out.print(numAnterior+ " ");
	while (contador<100) {
		temp=numAnterior + numActual;
		System.out.print(temp+ " ");
		numAnterior=numActual;
		numActual=temp;
		
		
		contador=contador + 1;
		
	}
	
}
}
