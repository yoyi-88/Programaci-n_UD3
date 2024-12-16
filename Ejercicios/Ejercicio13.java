package Tema3;

public class Ejercicio13 {
	public static void main(String[] args) {
		boolean resultado;
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };

		resultado = compararArrays(array1, array2);
		System.out.println(resultado);

	}

	public static boolean compararArrays(int[] array1, int[] array2) {
		boolean resultado = true;
		if (array1.length != array2.length)
			resultado = false;
		
		int i = 0;
		while (i < array1.length && resultado)  {
			if (array1[i] != array2[i]) {
				resultado = false;
			}
			i++;
		}
		
		return resultado;

	}
}