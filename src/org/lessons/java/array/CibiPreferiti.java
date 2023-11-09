package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] cibiPreferiti = {"pasta","prosciutto","porchetta","tonno","salmone","bietole","cetrioli", "melone"};
		
		int ciboPeggiore = cibiPreferiti.length -1;
		int ciboMediano = cibiPreferiti.length /2;
		
		System.out.println("La lista dei cibi preferiti e' lunga" + cibiPreferiti.length + "cibi");
		System.out.println("Il mio cibo preferito e'" + cibiPreferiti[0]);
		System.out.println("Il ciboche meno mi piace e'" + cibiPreferiti[ciboPeggiore]);
		System.out.println("Il cibo mediano e'" + cibiPreferiti[ciboMediano]);

	}
}
