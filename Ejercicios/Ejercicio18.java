package Tema3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		char c;
		int cont = 0;
		for (int i = 0; i < args.length; i++) {
			c = frase.charAt(i);
			if (c == ' ') {
				cont++;
			}
		}
	}

}
