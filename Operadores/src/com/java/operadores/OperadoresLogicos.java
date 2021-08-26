package com.java.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int idade = 10;
		boolean precisaVotar = idade >= 16 &&  idade <=70;
		System.out.println(precisaVotar);
		
		int vermelho = 1, amarelo = 2;
		boolean expulso = vermelho == 1 || amarelo == 2;
		System.out.println(expulso);
		
		expulso = vermelho > 10 ^ amarelo > 1;
		System.out.println(expulso); //xor precisa de uma ser positiva
		expulso = vermelho != 10;
		System.out.println(expulso);
	}
}
