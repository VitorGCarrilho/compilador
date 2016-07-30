package br.com.compilador.excecoes;

public class NumeroMuitoGrandeException extends Exception{

	private static final long serialVersionUID = 6955232727088258051L;
	public NumeroMuitoGrandeException(){}
	public NumeroMuitoGrandeException(String mensagem){
		super(mensagem);
	}
	
}
