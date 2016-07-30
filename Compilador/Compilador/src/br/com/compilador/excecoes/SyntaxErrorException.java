package br.com.compilador.excecoes;

public class SyntaxErrorException extends Exception  {
	private static final long serialVersionUID = 6539913349898770192L;
	
	public SyntaxErrorException(){}
	public SyntaxErrorException(String mensagem){
		super(mensagem);		
	}
	
}
