package br.com.compilador.excecoes;

public class MaisDeCincoCaracteresException extends Exception {

	private static final long serialVersionUID = -77119103865954330L;
	public MaisDeCincoCaracteresException(){}
	public MaisDeCincoCaracteresException(String mensagem){
		super(mensagem);
	}
	
}
