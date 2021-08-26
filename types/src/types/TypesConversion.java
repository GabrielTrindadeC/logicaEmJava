package types;

public class TypesConversion {

	public static void main(String[] args)
	{
		int inteiro = 10;
		long inteiroLong = inteiro;
		float floatLong = inteiroLong;
		System.out.println(inteiro);
		System.out.println(inteiroLong);
		System.out.println(floatLong);
		// conversão explicita
		floatLong = 33.03f;
		System.out.println(floatLong);
		int inteiroFloat = (int)floatLong;
		System.out.println(inteiroFloat); // ocorre perda de dados, int não aceita casas decimais
		// para esse tipo de conversão necessario CAST
	}

}
