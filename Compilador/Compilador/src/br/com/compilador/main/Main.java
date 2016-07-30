package br.com.compilador.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.compilador.compilador.Compilador;
import br.com.compilador.excecoes.ExpressaoInvalidaException;
import br.com.compilador.excecoes.MaisDeCincoCaracteresException;
import br.com.compilador.excecoes.NumeroInvalidoException;
import br.com.compilador.excecoes.SyntaxErrorException;
import br.com.compilador.lexico.AnalisadorLexico;
import br.com.compilador.util.Utilitario;

public class Main {
	public static void main(String []args) throws NumeroInvalidoException, MaisDeCincoCaracteresException, ExpressaoInvalidaException, FileNotFoundException, IOException, SyntaxErrorException{
		String arquivo = "C:\\Users\\vitor\\OneDrive\\Documentos\\Compilador\\arquivo2.txt";
		Compilador compilador = new Compilador();
		boolean compilou = compilador.compilar(arquivo);		
		//System.out.println(compilou);
		
	}
}
