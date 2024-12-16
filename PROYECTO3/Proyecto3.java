package Tema3;

import java.util.Scanner;

public class Proyecto3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] suma = new int[2][2];
		int[][] producto = new int[2][2];
		
		System.out.println("Introduzca el contenido de la primera matriz");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("Introduzca el contenido de la segunda matriz");	
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = sc.nextInt();
			}	
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
				producto[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] + matriz2[1][j];
			}	
		}
		System.out.println("Suma de las matrices: ");
		for (int[] fila : suma) {
			System.out.println(fila[0] + " " + fila[1]);
		}
		System.out.println("Producto de las matrices");
		for (int[] fila : producto) {
			System.out.println(fila[0] + " " + fila[1]);
		}
	}

}

