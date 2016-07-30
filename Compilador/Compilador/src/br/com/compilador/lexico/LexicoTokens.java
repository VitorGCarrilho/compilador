package br.com.compilador.lexico;

import br.com.compiladores.model.Alfabeto;

public class LexicoTokens {
	public boolean analisarTokens(String expressao){
		boolean isToken = false;
		char[] tokens = Alfabeto.getSimbolos();
		char[] arrayExpressao = expressao.toCharArray();
		if(arrayExpressao.length == 1){
			for(int i = 0; i<tokens.length; i++){
				if(arrayExpressao[0] == tokens[i]){
					isToken = true;
				}
			}
		} 		
		return isToken;
	}
}
