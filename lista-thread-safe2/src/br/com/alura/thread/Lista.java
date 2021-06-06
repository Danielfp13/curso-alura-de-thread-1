package br.com.alura.thread;

public class Lista {
	private String[] elementos = new String[1000];
	private int indice = 0;

	public synchronized void adicionaElementos(String elemento) {

		this.elementos[indice] = elemento;
		this.indice++;
		
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		if(this.indice == this.elementos.length) {
			System.out.println("lista ta cheia notificando");
			this.notify();
		}
	}

	public int tamanho() {
		return this.elementos.length;
	}

	public String pagaElemento(int posicao) {
		return this.elementos[posicao];
	}

	public boolean estaCheia() {
		
		return this.indice == tamanho();
	}
}
