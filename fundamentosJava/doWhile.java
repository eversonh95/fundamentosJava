package fundamentosJava;

public class doWhile {
	public static void main(String args[]) {
		int numero = 1;
		
		/*while (numero<5) {//enquanto
			System.out.println("EXECUTOU " + numero);
			numero = numero + 1;
		}*/
		
		do {//faça
			System.out.println(numero);
			numero = numero + 1;
		} while (numero <= 5);
	}


}
