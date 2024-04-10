package ar.edu.unju.fi.ejercicio3;

public class Main {

	public static void main(String[] args) {
		// uso del for
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Valor de i es: "+i);
		}
		
		int numero = 0;
		for(int i = 2; numero < 20; numero++) {
			System.out.println("Valor para número: "+numero);
			System.out.println("- Valor para número multiplicado por 2: "+numero*i);
		}
		
		for(int i=0, j=20, k=2; i < j; i++, k++) {
			System.out.println("Multiplicación "+i+" x "+j +" = "+i*j);
			System.out.println("Suma "+ j + " + "+k+" = "+(j+k));
		}
		
	}

}
