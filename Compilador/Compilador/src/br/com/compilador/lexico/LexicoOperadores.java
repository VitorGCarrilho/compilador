package br.com.compilador.lexico;

import br.com.compiladores.model.Alfabeto;

public class LexicoOperadores {
	
	public boolean analisarOperadores(String expressao){
		char[] operadores = Alfabeto.getOperadores();
		boolean isOperador = false;
		char operador;
 		
		if(expressao.length()==1){
			operador = expressao.charAt(0);
			for(int i = 0; i<operadores.length; i++){
	 			if(operador == operadores[i]){
	 				isOperador = true;
	 			}
	 		}
		}		
		return isOperador;
	}
}
