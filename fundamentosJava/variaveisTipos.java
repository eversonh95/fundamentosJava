package fundamentosJava;

public class variaveisTipos {
	public static void main(String args[]) {
		//String - textos ex: "café", "escola"
		String minhaVariavelString = "Everson 10";
		
		System.out.println( minhaVariavelString );//Mostra  variavel
		
		final int idade = 26;//serve para variaveis constantes
		
		//Variaveis numeros
		//byte - numeros ex: 1,3,20 de -128 até 127, indicado para numeros muito pequenos
		byte minhaVariavelByte = 20;
		System.out.println(minhaVariavelByte);
		
		//short - números ex: 1,180,900 de 3768 até 32767
		short minhaVariavelShort = 3200;
		System.out.println(minhaVariavelShort);
		
		//int - números ex: 1,180 de -2147483648 até 2147483647
		int minhaVariavelInt = 380000;
		
		//long - numeros 1, 50000 de -32233720368544775808 até 9223372036854807
		long minhaVariavelLong = 10000000000L;
		System.out.println(minhaVariavelLong);
		
		//float - numereos decimais ex:1,2535 / precisao de 7
		float preco = 2.1234567f;
		System.out.println(preco);
				
		//double - numeros decimais precisao de 15 a 16 casas decimais
		double precoDouble = 2.1236462;
		System.out.println(precoDouble);
		
		//boolean - valores booleanos = true or false
		boolean minhaVariavelBoolean = true;
		System.out.println(minhaVariavelBoolean);
	}

}
