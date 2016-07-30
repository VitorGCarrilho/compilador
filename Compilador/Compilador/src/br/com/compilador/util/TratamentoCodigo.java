package br.com.compilador.util;

public class TratamentoCodigo {

	
	public static String tratarCodigo(String codigo){
		codigo = codigo.replaceAll("\t"," ");
		String aux = null;
		aux = codigo.replaceAll("  "," ");
		while(aux != codigo){
			codigo = codigo.replaceAll("  "," ");
			aux = codigo.replaceAll("  "," ");
		}
		return codigo;		
	}
}
