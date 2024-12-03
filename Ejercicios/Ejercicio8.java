package Tema3;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int t[] = {1, 2, 3, 4, 5};
		System.out.println(maximo(t));
	}
	public static int maximo(int t[]) {
		int max = t[0];
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] > max) {
				max = t[i];
			}
		}
		return max;
	}
}
