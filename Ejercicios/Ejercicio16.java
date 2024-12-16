package Tema3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean iguales;
		int longitud1;
		int longitud2;
		String palabra1;
		String palabra2;
		
		System.out.println("Escribe primera palabra");
		palabra1 = sc.nextLine();
		System.out.println("Escribe segunda palabra");
		palabra2 = sc.nextLine();
		
		longitud1 = palabra1.length();
		longitud2 = palabra2.length();
		
		iguales = palabra1.equals(palabra2);
		
		if (iguales == true) {
			System.out.println("Son iguales");
		} else if(longitud1 > longitud2){
			System.out.println("La primera palabra es mayor");
		}else if(longitud1 < longitud2){
			System.out.println("La segunda palabra es mayor");
		}
	}
}
