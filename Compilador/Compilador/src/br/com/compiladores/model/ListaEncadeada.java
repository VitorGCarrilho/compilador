package br.com.compiladores.model;

public class ListaEncadeada {
	private Token head; // refer�ncia do primeiro n� (cabe�a) da lista
	private int size = 0; // tamanho (n�mero de n�s) da lista

	public ListaEncadeada() // construtor da lista
	{
		head = null;
	}

	public boolean isEmpty() // verifica se a lista est� vazia
	{
		return (head == null);
	}

	public int size() // retorna o tamanho da lista
	{
		return size;
	}

	public void insertFirst(Token node) // m�todo que permite a inser��o // no
										// in�cio da Lista
	{
		if (isEmpty()) {
			head = node;
			size++;
		} else {
			Token novo = node; // cria um novo n� na lista
			novo.setNext(head); // conecta esse n� ao primeiro da lista
			head = novo; // faz a cabe�a da lista apontar para esse n�
			size++; // incrementa o tamanho da lista
		}
	}

	public void insertFirst(String valorToken, TabelaSimbolosEnum valor) // m�todo que permite a inser��o // no
	// in�cio da Lista
	{
		if (isEmpty()) {
			head = new Token(valorToken, valor);
			size++;
		} else {
			Token novo = new Token(valorToken, valor); // cria um novo n� na lista
			novo.setNext(head); // conecta esse n� ao primeiro da lista
			head = novo; // faz a cabe�a da lista apontar para esse n�
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
	
	public Token removeFirst() // m�todo que remove um n� da cabe�a da lista
								// encadeada simples
	{
		if (isEmpty()) {
			System.out.println("Erro: a lista encadeada simples esta vazia!");
			return null;
		} else {
			// armazena o n� a ser removido numa vari�vel
			Token firstData = head;
			// faz a cabe�a apontar para o pr�ximo n�
			head = head.getNext();
			// diminui o tamanho da lista
			size--;
			// retorna o n� removido
			return firstData;
		}
	}
	
	public int getSize(){
		return size;
	}

	public void printList() // m�todo que imprime os elementos armazenados na
							// lista
	{
		Token current = head; // ponteiro para percorrer a lista
		System.out.println("Conteudo da Lista: ");
		while (current != null) {
			System.out.println("Valor Token: " + current.getToken() + " Valor:" + current.getValor());
			current = current.getNext(); // move-se para o pr�ximo n�
		}
		System.out.println("tamanho da lista = " + size);
	}
}