package Tema3;

import java.net.Socket;
import java.util.Scanner;

public class Ampliacion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma0 = 0;
		int suma0cont = 0;
		int sumapositivos = 0;
		int positcont = 0;
		int sumanegativos = 0;
		int negacont = 0;
		int fin;
		int n;
		do {
			n = sc.nextInt();
			if (n == 0) {
				suma0 = suma0 + n;
				suma0cont ++;
			}
			if (n > 0) {
				sumapositivos += n;
				positcont ++;
			}
			if (n < 0) {
				sumanegativos += n;
				negacont ++;
			}
			fin = sc.nextInt();
		} while (fin != 88);
		System.out.println(suma0cont);
		System.out.println(sumapositivos / positcont);
	}

}
