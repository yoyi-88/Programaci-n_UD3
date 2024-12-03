package Tema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 numeros decimales");
		double numeros[] = new double [5];
		numeros[0] = sc.nextDouble();
		numeros[1] = sc.nextDouble();
		numeros[2] = sc.nextDouble();
		numeros[3] = sc.nextDouble();
		numeros[4] = sc.nextDouble();
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
