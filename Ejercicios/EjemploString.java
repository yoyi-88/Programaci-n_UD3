package Tema3;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\u2661");
		
		//escapar
		System.out.println("hola \"Fr\tan");
		
				
		//Convertir
		int i = 65;
		char c = (char)i;
		System.out.println(c);
		
		char d = 'A';
		int e = d;
		System.out.println(e);
		
		//convertir int a string
		int j = 123;
		String s = String.valueOf(j);
		
		//comparar cadenas
		String cad1 = ("hola");
		String cad2 = new String("hola");
		System.out.println(cad1 == cad2);
		
		// Comparar cad1 y cad2 con equals
		
		System.out.println(cad1.equals(cad2));
		
		// Probar metodo  compareTo
		int comparacion;
		// Cadenas iguales
		comparacion = "hola".compareTo("hola");
		// Cadena invocante menor
		comparacion = "casa".compareTo("dedo");
		// Cadena invocante mayor
		comparacion = "dedo".compareTo("casa");
		//todo esto va por orden alfabetico
		
		if(comparacion == 0) {
			System.out.println("son iguales");
		}else if(comparacion<0){
			System.out.println("primera menor");
		}else {
			System.out.println("primera mayor");
		}
		
		System.out.println("123".indexOf("fran"));
		
		"".isEmpty();
		"hola fran".concat("pepito");
		"asdf".replace("a", "b");
		"asdasdfas".toUpperCase();
		"asdfadaa".split("b");
	}

}
