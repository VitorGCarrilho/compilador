package br.com.compilador.lexico;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.compilador.excecoes.ExpressaoInvalidaException;
import br.com.compilador.excecoes.MaisDeCincoCaracteresException;
import br.com.compilador.excecoes.NumeroInvalidoException;
import br.com.compilador.util.Leitor;
import br.com.compilador.util.TratamentoCodigo;
import br.com.compiladores.model.ListaEncadeada;
import br.com.compiladores.model.TabelaSimbolosEnum;
import br.com.compiladores.model.Token;

public class AnalisadorLexico {

	public ListaEncadeada fazerAnaliseLexica(String arquivo) throws MaisDeCincoCaracteresException, ExpressaoInvalidaException,
			NumeroInvalidoException, FileNotFoundException, IOException {
		
		String codigo = Leitor.lerArquivo(arquivo);
		codigo = TratamentoCodigo.tratarCodigo(codigo);
		String[] token = Extrator.extrair(codigo);
		
		ListaEncadeada lista = new ListaEncadeada();
		
		for (int i = 0; i < token.length; i++) {
			Token simbolo = new Token();
			simbolo = analisar(token[i]);
			lista.insertLast(simbolo);
		
		}
		return lista;
	}

	private Token analisar(String token)
			throws MaisDeCincoCaracteresException, ExpressaoInvalidaException, NumeroInvalidoException {

		LexicoNumerosReais analisadorLexicoNumerosReais = new LexicoNumerosReais();
		LexicoPalavrasReservadas analisadorLexicoPalavrasReservadas = new LexicoPalavrasReservadas();
		LexicoVariaveis analisadorLexicoVariaveis = new LexicoVariaveis();
		LexicoOperadores analisadorLexicoOperadores = new LexicoOperadores();
		LexicoTokens analisadorLexicoTokens = new LexicoTokens();
		LexicoParentizadores analisadorLexicoParentizadores = new LexicoParentizadores();

		boolean isNumeroValido = analisadorLexicoNumerosReais.analisaNumero(token);
		boolean isPalavraReservada = analisadorLexicoPalavrasReservadas.analisaPalavraReservada(token);
		boolean isVariavel = analisadorLexicoVariaveis.analisaVariaveis(token);
		boolean isOperador = analisadorLexicoOperadores.analisarOperadores(token);
		boolean isToken = analisadorLexicoTokens.analisarTokens(token);
		boolean isParentizador = analisadorLexicoParentizadores.analisarParentizadores(token);

		Token simbolo = new Token();
		
		if (isNumeroValido) {
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.NUMERO);
			return simbolo;
		} else if (isPalavraReservada) {
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.PALAVRA_RESERVADA);
			return simbolo;
		} else if (isVariavel) {
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.VARIAVEL);
			return simbolo;
		} else if (isOperador){
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.OPERADOR);
			return simbolo;
		} else if (isToken){
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.SIMBOLO);
			return simbolo;
		} else if (isParentizador){
			simbolo.setToken(token);
			simbolo.setValor(TabelaSimbolosEnum.PARENTIZADOR);
			return simbolo;
		} else {
			throw new ExpressaoInvalidaException();
		}

	}

}
