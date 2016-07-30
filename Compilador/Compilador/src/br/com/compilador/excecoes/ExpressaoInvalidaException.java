package br.com.compilador.excecoes;

public class ExpressaoInvalidaException extends Exception {

	private static final long serialVersionUID = -8929225094848267981L;

	public ExpressaoInvalidaException(){}
	public ExpressaoInvalidaException(String mensagem){
		super(mensagem);
	}

}
