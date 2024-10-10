package view;

import fatec.sp.gov.lib.filas.FilaGenerica;
import fatec.sp.gov.lib.listas.ListaGenerica;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		ListaGenerica<Integer> lista = new ListaGenerica<Integer>();
		
		//Adicionando os elementos na lista
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(18);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(13);
		lista.addLast(4);
		lista.addLast(16);
		
		//Iniciando o exercício
		FilaGenerica<Integer> fila = new FilaGenerica<Integer>();

		int tamanho = lista.size();
		System.out.println("Lista: ");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		while(lista.isEmpty() == false) {
			int valor = lista.get(0);
			fila.insert(valor);
			lista.removeFirst();
		}
		
		System.out.println("Fila: ");
		fila.list();
		
		while(fila.isEmpty() == false) {
			int valor = fila.remove();
			lista.addFirst(valor);
		}
		
		System.out.println("Lista: ");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		
	}
}
