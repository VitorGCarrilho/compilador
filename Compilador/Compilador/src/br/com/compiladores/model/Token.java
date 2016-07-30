package br.com.compiladores.model;

public class Token {
	private String token;
	private TabelaSimbolosEnum valor;
	private Token next;
	
	public Token() {
		token = null;
		valor = null;
		next = null;
	}

	public Token(String valorToken, TabelaSimbolosEnum valor) {
		this.token = valorToken;
		this.valor = valor;
		next = null;
	}

	public Token(String valorToken, TabelaSimbolosEnum valor, Token n) {
		this.token = valorToken;
		this.valor = valor;
		next = n;
	}

	public Token getNext() {
		return next;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String valorToken) {
		this.token = valorToken;
	}

	public TabelaSimbolosEnum getValor() {
		return valor;
	}

	public void setValor(TabelaSimbolosEnum valor) {
		this.valor = valor;
	}

	public void setNext(Token n) {
		next = n;
	}
}