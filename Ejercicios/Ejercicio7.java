package Tema3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 numeros enteros");
		int numeros[] = new int [5];
		numeros[0] = sc.nextInt();
		numeros[1] = sc.nextInt();
		numeros[2] = sc.nextInt();
		numeros[3] = sc.nextInt();
		numeros[4] = sc.nextInt();
		
		for(int i = 4; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
