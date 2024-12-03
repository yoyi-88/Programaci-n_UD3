package Tema3;

public class Ejercicio3 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double aumento = 1.10;
		double sueldofinal;
		int sueldos [] = {1800, 1200, 2000, 1200 ,900};
		sueldos [0] = 1800;
		sueldos [1] = 1200;
		sueldos [2] = 2000;
		sueldos [3] = 1200;
		sueldos [4] = 900;
		
		System.out.println("Con for regular:");
		for(int i = 0; i < sueldos.length; i++) {
			sueldofinal = sueldos[i] * aumento;
			System.out.println(sueldofinal);
		}
		System.out.println();
		System.out.println("Con for each:");
		for (int x : sueldos) {
			sueldofinal = x * aumento;
			System.out.println(sueldofinal);
		}
	}
}
