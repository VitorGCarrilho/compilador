package br.com.compilador.lexico;

import java.util.ArrayList;

import br.com.compiladores.model.Alfabeto;

public class Extrator {
	public static String[] extrair(String codigo) {
		char[] caracter = codigo.toCharArray();
		String expressao = "";
		ArrayList<String> expressoes = new ArrayList<String>();

		for (int i = 0; i < caracter.length; i++) {
			if (caracter[i] == ' ' && !expressao.equals("")) {
				expressoes.add(expressao);
				expressao = "";
			} else if (caracter[i] == ' ' && expressao.equals("")) {
				expressao = "";
			} else if (isOperador(caracter[i]) || isToken(caracter[i]) || isParentizador(caracter[i])) {
				if (!expressao.equals(""))
					expressoes.add(expressao);
				expressao = String.valueOf(caracter[i]);
				expressoes.add(expressao);
				expressao = "";
			} else {
				expressao = expressao + caracter[i];
			}
		}

		String[] arrayExpressoes = new String[expressoes.size()];
		int i = 0;
		for (String value : expressoes) {
			arrayExpressoes[i] = value;
			i++;
		}

		return arrayExpressoes;
	}

	private static boolean isOperador(char operador) {
		char[] operadores = Alfabeto.getOperadores();
		boolean isOperador = false;

		for (int i = 0; i < operadores.length; i++) {
			if (operador == operadores[i]) {
				isOperador = true;
			}
		}

		return isOperador;
	}
	
	private static boolean isToken(char operador){
		char[] tokens = Alfabeto.getSimbolos();
		boolean isToken = false;

		for (int i = 0; i < tokens.length; i++) {
			if (operador == tokens[i]) {
				isToken = true;
			}
		}

		return isToken;
	}
	
	private static boolean isParentizador(char caracter){
		boolean isParentizador = false;
		char[] parentizador = Alfabeto.getParentizadores();
		
		for(int i = 0; i<parentizador.length; i++){
			if(caracter == parentizador[i]){
				isParentizador = true;
			}
		}
		 		
		return isParentizador;
	}
}
