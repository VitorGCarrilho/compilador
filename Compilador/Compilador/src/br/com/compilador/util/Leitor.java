package br.com.compilador.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static String lerArquivo(String arquivo) throws FileNotFoundException, IOException{
		String linha = "";
		int aux = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        if(aux == 0){
		        	linha = linha + line;
		        	aux++;
		        } else {
		        	linha = linha + " "+ line;
		        }
		    	
		    }
		    linha += " ";
		}
		return linha;
	}
}
