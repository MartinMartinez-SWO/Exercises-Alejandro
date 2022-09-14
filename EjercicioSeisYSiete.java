package utils;

public class EjercicioSeisYSiete {
	
	public static void arrayPersonas() {
		String[] personas = {"Martín", "Pedro", "Estrella", "Emma", "Cesar", "Breis", "Juan"};
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}
	}
	
	public static void arrayPersonas2() {
		String[] personas = {"Martín", "Pedro", "Estrella", "Emma", "Cesar", "Breis", "Juan"};
		for(String a: personas) {
			System.out.println(a);
		}
	}
	
public static void main(String[] args) {
	arrayPersonas();
	arrayPersonas2();
}
}
