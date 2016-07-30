package br.com.compilador.lexico;

import br.com.compilador.excecoes.ExpressaoInvalidaException;
import br.com.compilador.excecoes.MaisDeCincoCaracteresException;
import br.com.compilador.excecoes.NumeroInvalidoException;
import br.com.compilador.util.Util;

public class LexicoNumerosReais {
	
	public boolean analisaNumero(String expressao)
			throws  MaisDeCincoCaracteresException, ExpressaoInvalidaException, NumeroInvalidoException {
		char[] caracter = expressao.toCharArray();
					
		if (Util.isNumeroReal(caracter[0])) {
			int nPontos = 0;
			int nNumeros = 1;
			
			for (int i = 1; i < caracter.length -1; i++) {
				
				if (Util.isNumeroReal(caracter[i]) || caracter[i] == '.') {
					if (caracter[i] == '.') {
						nPontos++;
					} else {
						nNumeros++;
					}
					
				} else {
					throw new ExpressaoInvalidaException(expressao + " nao e um numero valido");
				}
				
			}
			if(!Util.isNumeroReal(caracter[caracter.length-1]))		
				throw new NumeroInvalidoException(expressao + " nao e um numero valido, pois possui um ponto no final da sentenca");
			if (nPontos > 1)
				throw new NumeroInvalidoException(expressao + " nao e um numero valido Possui mais de um ponto('.')");
			if (nNumeros > 5)
				throw new MaisDeCincoCaracteresException(expressao + " contem mais que cinco caracteres. ");
			return true;
		} else {
			return false;
		}

	}
	
	
}
