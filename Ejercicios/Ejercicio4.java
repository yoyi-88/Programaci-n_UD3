package Tema3;

/**
 * Crear una tabla de longitud 10 que se inicializará con números aleatorios
 * comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios que
 * se guardan en la tabla.
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		double suma = 0;
		double aleatorios[] = new double[10];
		aleatorios  [0] = Math.random()*100;
		aleatorios  [1] = Math.random()*100;
		aleatorios  [2] = Math.random()*100;
		aleatorios  [3] = Math.random()*100;
		aleatorios  [4] = Math.random()*100;
		aleatorios  [5] = Math.random()*100;
		aleatorios  [6] = Math.random()*100;
		aleatorios  [7] = Math.random()*100;
		aleatorios  [8] = Math.random()*100;
		aleatorios  [9] = Math.random()*100;
		System.out.println(aleatorios);
		for(int i = 0; i < aleatorios.length; i++) {
			suma = suma + aleatorios[i];
		}
		System.out.println("La suma de los 10 números aleatorios es: " + suma);
	}
}
