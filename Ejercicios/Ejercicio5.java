package Tema3;


public class Ejercicio5 {
	public static void main(String[] args) {
		int numeros[] = { 1, 2, 3, 4, 5 };
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		int resultado = suma(numeros);
	}
	
	public static int suma(int[] numeros) {
		int suma = 0;
		for(int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		System.out.println(suma);
		return suma;
	}
}