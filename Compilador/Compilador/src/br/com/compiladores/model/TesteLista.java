package br.com.compiladores.model;

public class TesteLista {
	
	
	
	public static void main(String [] args){
		ListaEncadeada lista = new ListaEncadeada();
		lista.insertLast("(", TabelaSimbolosEnum.PARENTIZADOR);
		lista.insertLast("30", TabelaSimbolosEnum.NUMERO);
		lista.insertLast("+", TabelaSimbolosEnum.OPERADOR);
		lista.insertLast("1", TabelaSimbolosEnum.NUMERO);
		lista.insertLast(")", TabelaSimbolosEnum.PARENTIZADOR);
		lista.printList();
		Token token;
		token = lista.removeFirst();
		System.out.println("Valor Token: "+token.getToken()+" valor: "+token.getValor());
		token = lista.removeFirst();
		System.out.println("Valor Token: "+token.getToken()+" valor: "+token.getValor());
	}
}
