package Tema3;


public class arrayVacioForeach {
	public static void main(String[] args) {
		int suma = 0;
		int naturales[] = new int [5];
		for(int i = 0; i < naturales.length; i++) {
			suma = suma + i;
		}
		System.out.println(suma);
	}

}
