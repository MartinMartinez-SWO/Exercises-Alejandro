package utils;

import java.util.Scanner;

public class EjercicioCinco {

	public static void rangos() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entre el 1 y el 50");
		int numero = scanner.nextInt();

		if (numero < 1 || numero > 50) {
			System.out.println("El número no es valido");
			numero = scanner.nextInt();
		} else {
			//if the number is valid, verify weather if it is par or odd.
			if (numero%2 == 0) {
				System.out.println("Número par");
			}else {
				System.out.println("Número impar");
			}
			
		}

	}

	public static void main(String[] args) {
		rangos();
	}
}
