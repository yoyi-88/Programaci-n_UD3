package Tema3;

import java.net.Socket;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña;
		String intento;
		
		System.out.println("Jugador 1, introduzca la contraseña");
		contraseña = sc.next();

		
		do {
			System.out.println("Jugador 2, realize intento");
			intento = sc.next();
			
			if(contraseña.compareTo(intento) < 0){
				System.out.println("La contraseña es mayor que el intento");
			}else if(longcontraseña < longintento){
				System.out.println("La contraseña es menor que el intento");
			}
			
		}while (contraseña != intento);
		System.out.println("Has ganado");
		
	}

}
