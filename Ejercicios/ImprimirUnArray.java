package Tema3;

public class ImprimirUnArray {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 6;
		numeros[3] = 8;
		numeros[4] = 10;
		//Imprimir la referencia
		System.out.println("Referencia: " + numeros);
		//Imprimir el array
		System.out.println("Contenido del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		//Imprimir con foreach
		System.out.println("Contenido del array con foreach:");
		for (int i : numeros) {
			System.out.println(i);
		}
		
	}

}
