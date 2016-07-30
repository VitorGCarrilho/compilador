package br.com.compilador.lexico;

import br.com.compilador.util.Util;

public class LexicoPalavrasReservadas {
	public boolean analisaPalavraReservada(String expressao){
		if(Util.isPalavraReservadad(expressao)){
			return true;
		}else {
			return false;
		}
	}
	

}
