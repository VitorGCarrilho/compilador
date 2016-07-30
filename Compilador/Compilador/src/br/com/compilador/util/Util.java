package br.com.compilador.util;

import br.com.compiladores.model.Alfabeto;

public class Util {
	
	public static boolean isNumeroReal(char caracter) {
		char numerosReais[] = Alfabeto.getNumerosReais();
		boolean is = false;
		for (int i = 0; i < numerosReais.length; i++) {
			if (caracter == numerosReais[i]) {
				is = true;
				break;
			}
		}
		return is;
	}
	
	
	public static boolean isPalavraReservadad(String expressao){
		String[] palavrasReservadas = Alfabeto.getPalavrasReservadas();
		boolean is = false;
		for(int i = 0 ; i< palavrasReservadas.length; i++){
			if (expressao.equals(palavrasReservadas[i])){
				is = true;
				break;
			}
		}
		
		return is;
	}
	
	public static boolean isLetraAlfabeto(char caracter){
		char[] alfabeto = Alfabeto.getAlfabeto();
		boolean isInAlfabeto = false;
		for(int i = 0; i<alfabeto.length; i++){
			if(caracter == alfabeto[i]){
				isInAlfabeto = true;
			}
		}
		return isInAlfabeto;
	}
	
}
