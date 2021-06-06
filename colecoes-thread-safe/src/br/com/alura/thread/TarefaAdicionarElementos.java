package br.com.alura.thread;

import java.util.List;

public class TarefaAdicionarElementos implements Runnable {

	
	private List<String> lista;
	private int numeroDaThread;

	public TarefaAdicionarElementos(List<String> lista, int numeroDaThread) {
		this.lista = lista;
		this.numeroDaThread = numeroDaThread;
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.add("Thread  " + numeroDaThread + " - " + i);
		}
	}

}
