package br.com.compilador.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Utilitario {
	private static BufferedReader br;

	public static String ler(String arquivo) {
	    String text = "";
	    int read, N = 1024 * 1024;
	    char[] buffer = new char[N];

	    try {
	        FileReader fr = new FileReader(arquivo);
	        br = new BufferedReader(fr);

	        while(true) {
	            read = br.read(buffer, 0, N);
	            text += new String(buffer, 0, read);

	            if(read < N) {
	                break;
	            }
	        }
	    } catch(Exception ex) {
	        ex.printStackTrace();
	    }

	    return text;
	}	
}
