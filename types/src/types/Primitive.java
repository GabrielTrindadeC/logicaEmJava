package types;

public class Primitive {

	public static void main(String[] args) {
		boolean bol = true; 
		System.out.println("boolean, por default false" +" " + bol);
		byte a = -127;
		System.out.println("tipo numerico inteiro, 8bits de memoria com range de -127 até 127");
		char b = '\u0000';
		System.out.println("caracteres(um unico) da tabela ASCII(65k+ de caracteres), 16 bits");
		short c = 32767; 
		System.out.println("tipo numerico inteiro, 16 bits de memoria com range de 32,768  até 32,767");
		int d = 2147483647;
		System.out.println("tipo numerico inteiro, 32bits de memoria com range de -2,147,483,648 até 2,147,483,647");
		long esqueciDessaAqui = 10000000000l;
		System.out.println("tipo numerico inteiro, 64bits de memoria com range de -9,223,372,036,854,775,808(-2^63) até 9,223,372,036,854,775,807 (inclusive)(2^63 -1)");
		float e = 0.3f;
		System.out.println("tipo numerico flutuante, 32bits de memoria até 7 digitos decimais ");
		double f = 0.3;
		System.out.println("tipo numerico flutuante, 64bits de memoria até 16 digitos decimais");
	}

}
