package br.com.compilador.excecoes;

public class NumeroInvalidoException extends Exception {
	
	private static final long serialVersionUID = 2235452802645279290L;
	public NumeroInvalidoException(){}
	public NumeroInvalidoException(String mensagem){
		super(mensagem);
	}

}
