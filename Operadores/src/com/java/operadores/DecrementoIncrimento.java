package com.java.operadores;

public class DecrementoIncrimento {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("decremento");
		x --;
		System.out.println(x);
		-- x; // tambem funciona neste caso (variavel isolada)
		System.out.println(x);
		x --;
		System.out.println(x);
		x --;
		System.out.println(x);
		x --;
		System.out.println(x);
		System.out.println("incremento");
		x ++;
		System.out.println(x);
		x ++;
		System.out.println(x);
		x ++;
		System.out.println(x);
		x ++;
		System.out.println(x);
		x ++;
		System.out.println(x);
		
		int z = 10, w = 5, a = 5;
		z = w++; // neste caso, z vai receber w primeiro (5) e posteriormente w vai receber o incremento 
		System.out.println("z = " + z); 
		System.out.println("z = " + w);
		z = -- a;
		System.out.println("z = " + z); // z vai receber a ja decrementado
		System.out.println("a = " + a); // a sofre decremento 
	}
}
