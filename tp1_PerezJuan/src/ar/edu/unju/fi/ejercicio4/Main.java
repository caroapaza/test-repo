package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// uso de estructura de selección múltiple switch
		Scanner sc = new Scanner(System.in);
		byte opcion =0;
		do {
			System.out.println("1 - Alta alumno");
			System.out.println("2 - Alta Materia");
			System.out.println("3 - Mostrar alumnos");
			System.out.println("4 - Salir");
			System.out.println("Seleccione una opción:");
			opcion = Byte.parseByte(sc.nextLine());
			switch(opcion) {
				case 1:
					System.out.println("Ingrese nombre del alumno:");
					String nombreAlumno = sc.nextLine();
					System.out.println("El nombre ingresado es: "+nombreAlumno);
					break;
				case 2:
					System.out.println("Ingrese nombre materia:");
					String nombreMateria = sc.nextLine();
					System.out.println("El nombre de la materia es: "+nombreMateria);
					break;
				case 3:
					System.out.println("es la opción 3");
					break;
				case 4:
					System.out.println("FIN DEL PROGRAMA");
					break;
				default:
						System.out.println("Opción incorrecta");
			}
			
		}while(opcion != 4);
		
		System.out.println("fuera del do-while, cerrar scanner!");
		sc.close();

	}

}
