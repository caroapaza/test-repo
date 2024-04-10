package ar.edu.unju.fi.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// manejo de excepciones
		Scanner sc = new Scanner(System.in);
		boolean bandera;
		do {
			bandera = false;
			try {
				
				System.out.println("Ingrese un número:");
				int nro = sc.nextInt();
				System.out.println("El número ingresado es: "+nro);
				
				
			}catch(InputMismatchException ex) {
				System.out.println("El valor ingresado no es correcto");
				bandera = true;
				//ex.printStackTrace();
			}catch(Exception ex){
				System.out.println("Hubo un problema al procesar los datos.");
				bandera = true;
			}
		}while(bandera);
			
		sc.close();

	}

}
