package br.com.alura.thread;

public class TarefaImpriir implements Runnable {

	private Lista lista;

	public TarefaImpriir(Lista lista) {
		this.lista = lista;

	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		synchronized (lista) {

			if (!lista.estaCheia()) {
				try {
					System.out.println("Indo esperar, aguardando notificação");
					lista.wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			for (int i = 0; i < lista.tamanho(); i++) {
				System.out.println(i + " - " + lista.pagaElemento(i));
			}
		}
	}

}
