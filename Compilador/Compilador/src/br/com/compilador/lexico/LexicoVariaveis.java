package br.com.compilador.lexico;

import br.com.compilador.util.Util;

public class LexicoVariaveis {
	public boolean analisaVariaveis(String expressao){
		char[] caracter = expressao.toCharArray();
		boolean isVariavel = false;
		if(Util.isLetraAlfabeto(caracter[0])){
			for(int i = 1; i<caracter.length;i++){
				if(Util.isLetraAlfabeto(caracter[i]) || Util.isNumeroReal(caracter[i]) || caracter[i] == '_'){
					isVariavel = true;
				} else {
					isVariavel = false;
					break;
				}
			}
		} 		
		return isVariavel;
	}
}
