package br.com.compiladores.model;

public class Alfabeto {
	private final static char alfabeto[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private final static char caracterSublinhado = '_';
	private final static char numerosReais[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
	private final static char simbolo[] = { ';', ',', '"', '\'' };
	private final static char parentizadores[] = { '{', '}', '(', ')' };

	private final static char operadores[] = { '+', '-', '/', '*', '=' };
	private final static String palavrasReservadas[] = { "begin", "end", "if", "while", "for", "String", "number",
			"float" };

	public static char[] getAlfabeto() {
		return alfabeto;
	}

	public static char getCaracterSublinhado() {
		return caracterSublinhado;
	}

	public static char[] getNumerosReais() {
		return numerosReais;
	}

	public static char[] getSimbolos() {
		return simbolo;
	}

	public static char[] getOperadores() {
		return operadores;
	}

	public static String[] getPalavrasReservadas() {
		return palavrasReservadas;
	}

	public static char[] getParentizadores() {
		return parentizadores;
	}
}
