package br.com.alura.thread;

import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

//		Lista lista = new Lista();

		// List<String> lista = new ArrayList<>();
		// List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		List<String> lista = new Vector<String>();
		for (int i = 0; i < 10; i++) {

			new Thread(new TarefaAdicionarElementos(lista, i)).start();
		}

		Thread.sleep(3000);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i));
		}
	}

}
