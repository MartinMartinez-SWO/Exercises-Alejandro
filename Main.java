package ejercicios1;

import java.util.Scanner;

public class Main {

	// ejercicio 3
	public static void datosUsuario() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Introduce el nombre:");
		String nombre = scanner1.next();
		System.out.println("Introduce el email:");
		String email = scanner1.next();
		System.out.println(nombre);
		System.out.println(email);
	}

	// ejercicio 4
	public static String pideNumero() {
		String mensaje = "";
		Scanner scanner = new Scanner(System.in);

		int variable = scanner.nextInt();
		while (variable != 5) {
			System.out.println("Ese no me vale, dame otro para apagarme");
			variable = scanner.nextInt();

		}

		if (variable == 5) {

			mensaje = "Fin del programa";

		}
		return mensaje;
	}

	public static void main(String[] args) {
		// ejercicio1
		String nombre = "Martín";
		int edad = 27;

		System.out.format("Los datos del empleado son %s %d %n", nombre, edad);

		// ejercicio2
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		datosUsuario();
		System.out.println(pideNumero());
	}

}
