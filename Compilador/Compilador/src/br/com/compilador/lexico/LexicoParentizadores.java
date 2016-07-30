package br.com.compilador.lexico;

import br.com.compiladores.model.Alfabeto;

public class LexicoParentizadores {
	public boolean analisarParentizadores(String expressao){
		boolean isParentizador = false;
		char[] parentizador = Alfabeto.getParentizadores();
		char[] arrayExpressao = expressao.toCharArray();
		if(arrayExpressao.length == 1){
			for(int i = 0; i<parentizador.length; i++){
				if(arrayExpressao[0] == parentizador[i]){
					isParentizador = true;
				}
			}
		} 		
		return isParentizador;
	}
}