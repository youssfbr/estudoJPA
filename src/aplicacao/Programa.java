package aplicacao;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Alisson Youssf", "youssfbr@gmail.com");
		Pessoa p2 = new Pessoa(2, "Link Informática", "contato@linkinformatica.com.br");
		Pessoa p3 = new Pessoa(3, "Link da Silva", "linlin@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}
}
