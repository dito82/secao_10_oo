package application;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add(2, "B2");

		System.out.println("Tamanho da lista: " + list.size());
		
		for (String letras : list) {
			System.out.println("Letras: " + letras);
		}
		
		System.out.println("Index of B2: " + list.indexOf("B2"));

	}

}
