package br.com.alura.thread;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Lista lista = new Lista();

		// List<String> lista = new ArrayList<>();
		// List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		//List<String> lista = new Vector<String>();
		for (int i = 0; i < 10; i++) {

			new Thread(new TarefaAdicionarElementos(lista, i)).start();
		}
		
		new Thread(new TarefaImpriir(lista)).start();
		Thread.sleep(3000);
	}

}
