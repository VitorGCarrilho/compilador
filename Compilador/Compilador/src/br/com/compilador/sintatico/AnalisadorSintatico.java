package br.com.compilador.sintatico;

import br.com.compilador.excecoes.SyntaxErrorException;
import br.com.compiladores.model.ListaEncadeada;
import br.com.compiladores.model.TabelaSimbolosEnum;
import br.com.compiladores.model.Token;

public class AnalisadorSintatico {

	private static Token token;
	private static ListaEncadeada lista;

	public static void fazerAnaliseSintatica(ListaEncadeada l) throws SyntaxErrorException {
		lista = l;
		obtenha_simbolo();
		if(!token.getToken().equals("begin")){
			throw new SyntaxErrorException("Falta o \"begin\"");
		}
		while(lista.getSize() != 1){
			obtenha_simbolo();
			expressao();
			if(!token.getToken().equals(";")){
				throw new SyntaxErrorException("Falta o \";\" no fim da expressao");
			}
		}
		
		
		obtenha_simbolo();
		if(!token.getToken().equals("end")){
			throw new SyntaxErrorException("Falta o \"end\"");
		}
	}

	public static void expressao() throws SyntaxErrorException {
		termo();

		if (token.getToken().equals("+")) {
			obtenha_simbolo();
			expressao();
		}
		if (token.getToken().equals("-")) {
			obtenha_simbolo();
			expressao();
		}
		if (token.getToken().equals("=")) {
			obtenha_simbolo();
			expressao();
		}
		
	}

	public static void termo() throws SyntaxErrorException{
		fator();
		if(token.getToken().equals("*")){
			obtenha_simbolo();
			termo();
		}
		if(token.getToken().equals("/")){
			obtenha_simbolo();
			termo();
		}
	}
	
	public static void fator() throws SyntaxErrorException{
		primario();
		
	}
	
	public static void primario() throws SyntaxErrorException {
		if (token.getValor() == TabelaSimbolosEnum.VARIAVEL) {
			obtenha_simbolo();
		} else if (token.getValor() == TabelaSimbolosEnum.NUMERO) {
			obtenha_simbolo();
		} else if (token.getToken().equals("if")) {
			obtenha_simbolo();
			if (!token.getToken().equals("("))
				throw new SyntaxErrorException("Erro na clausula if");
			obtenha_simbolo();
			if (token.getValor() != TabelaSimbolosEnum.VARIAVEL)
				throw new SyntaxErrorException("Erro na clausula if");
			obtenha_simbolo();
			if (!token.getToken().equals(")"))
				throw new SyntaxErrorException("Erro na clausula if");
			obtenha_simbolo();
			expressao();
			
		} else if (token.getToken().equals("number")) { //#TODO deveria ser datatype mas precisa ser mudado no lexico
			obtenha_simbolo();
			if(token.getValor() != TabelaSimbolosEnum.VARIAVEL){
				throw new SyntaxErrorException("O data-type number não esta seguido de uma variavel");
			}
			obtenha_simbolo();
		} else if (token.getToken().equals("(")) {
			obtenha_simbolo();
			expressao();
			if (!token.getToken().equals(")")) {
				System.out.println("Falta o ')'");
			}
			obtenha_simbolo();
		} else if (token.getToken().equals("{")) {
			obtenha_simbolo();
			expressao();
			if (!token.getToken().equals("}")) {
				System.out.println("Falta o '}'");
			}
			obtenha_simbolo();
		} else if (token.getToken().equals("[")) {
			obtenha_simbolo();
			expressao();
			if (!token.getToken().equals("]")) {
				System.out.println("Falta o ']'");
			}
			obtenha_simbolo();
		} else {
			throw new SyntaxErrorException("Erro de sintaxe");
		}
	}
	
	public static void obtenha_simbolo(){
		
		token = lista.removeFirst();
		System.out.println("obteve simbolo: "+token.getToken());
		
	}
}
