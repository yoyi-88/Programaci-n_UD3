package Tema3;


public class Ejercicio9 {
	public static void main(String[] args) {
		char [][] matriz = {{'A', 'B','C'},{'D','E','F'},{'G','H','I'}};
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
}
