package Tema3;

public class forYforeach {
	public static void main(String[] args) {
		int suma = 0;
		int suma2 = 0;

		// otra explicación
		// x va reproduciendo todos los numeros de la variable naturales y la varieble
		// suma los suma
		//en el for normal para acceder al array debo usar el nombre de la variable y seguidamente el nombre del indice entre corchetes
		
		int naturales[] = { 1, 2, 3, 4, 5 };
		for (int x : naturales) {
			suma = suma + x;
		}
		System.out.println("Con for each: " + suma);

		
		for (int i = 0; i < naturales.length; i++) {
			suma2 = suma2 + naturales[i];
		}
		System.out.println("Con for normal: " + suma2);
	}

}
