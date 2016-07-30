package br.com.compiladores.model;

public class ListaEncadeada {
	private Token head; // referência do primeiro nó (cabeça) da lista
	private int size = 0; // tamanho (número de nós) da lista

	public ListaEncadeada() // construtor da lista
	{
		head = null;
	}

	public boolean isEmpty() // verifica se a lista está vazia
	{
		return (head == null);
	}

	public int size() // retorna o tamanho da lista
	{
		return size;
	}

	public void insertFirst(Token node) // método que permite a inserção // no
										// início da Lista
	{
		if (isEmpty()) {
			head = node;
			size++;
		} else {
			Token novo = node; // cria um novo nó na lista
			novo.setNext(head); // conecta esse nó ao primeiro da lista
			head = novo; // faz a cabeça da lista apontar para esse nó
			size++; // incrementa o tamanho da lista
		}
	}

	public void insertFirst(String valorToken, TabelaSimbolosEnum valor) // método que permite a inserção // no
	// início da Lista
	{
		if (isEmpty()) {
			head = new Token(valorToken, valor);
			size++;
		} else {
			Token novo = new Token(valorToken, valor); // cria um novo nó na lista
			novo.setNext(head); // conecta esse nó ao primeiro da lista
			head = novo; // faz a cabeça da lista apontar para esse nó
			size++; // incrementa o tamanho da lista
		}
	}
	
	public void insertLast(String valorToken, TabelaSimbolosEnum valor){
		if (isEmpty()) {
			head = new Token(valorToken, valor);
			size++;
		} else {
			Token novo = new Token(valorToken, valor);
			Token current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(novo);
			size++;
		}
	}

	public void insertLast(Token node){
		if (isEmpty()) {
			head = node;
			size++;
		} else {
			Token novo = node;
			Token current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(novo);
			size++;
		}
	}
	
	public Token removeFirst() // método que remove um nó da cabeça da lista
								// encadeada simples
	{
		if (isEmpty()) {
			System.out.println("Erro: a lista encadeada simples esta vazia!");
			return null;
		} else {
			// armazena o nó a ser removido numa variável
			Token firstData = head;
			// faz a cabeça apontar para o próximo nó
			head = head.getNext();
			// diminui o tamanho da lista
			size--;
			// retorna o nó removido
			return firstData;
		}
	}
	
	public int getSize(){
		return size;
	}

	public void printList() // método que imprime os elementos armazenados na
							// lista
	{
		Token current = head; // ponteiro para percorrer a lista
		System.out.println("Conteudo da Lista: ");
		while (current != null) {
			System.out.println("Valor Token: " + current.getToken() + " Valor:" + current.getValor());
			current = current.getNext(); // move-se para o próximo nó
		}
		System.out.println("tamanho da lista = " + size);
	}
}