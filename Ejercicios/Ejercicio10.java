package Tema3;

import java.util.Arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
		int[] num = new int [10];
		Arrays.fill(num, 1);
		System.out.println("Array base: " + Arrays.toString(num));
		
		Arrays.fill(num, 5, 9, 2);
		System.out.println("Array cambiado: " + Arrays.toString(num));
		
	}

}
