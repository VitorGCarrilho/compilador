package br.com.compilador.compilador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import br.com.compilador.excecoes.ExpressaoInvalidaException;
import br.com.compilador.excecoes.MaisDeCincoCaracteresException;
import br.com.compilador.excecoes.NumeroInvalidoException;
import br.com.compilador.excecoes.SyntaxErrorException;
import br.com.compilador.lexico.AnalisadorLexico;
import br.com.compilador.sintatico.AnalisadorSintatico;
import br.com.compiladores.model.ListaEncadeada;
import br.com.compiladores.model.Token;

public class Compilador {
	private AnalisadorLexico analisadorLexico;
	private AnalisadorSintatico analisadorSintatico;
	
	public boolean compilar(String arquivo) throws MaisDeCincoCaracteresException, ExpressaoInvalidaException, NumeroInvalidoException, FileNotFoundException, IOException, SyntaxErrorException{
		analisadorLexico = new AnalisadorLexico();
		ListaEncadeada tokens = analisadorLexico.fazerAnaliseLexica(arquivo);
		//tokens.printList();
		analisadorSintatico.fazerAnaliseSintatica(tokens);
		return true;
	}
		
	
}
