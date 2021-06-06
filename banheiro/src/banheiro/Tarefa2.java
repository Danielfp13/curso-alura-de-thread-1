package banheiro;

public class Tarefa2 implements Runnable {

	private Banheiro banheiro;
	
	
	public Tarefa2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}


	@Override
	public void run() {
		banheiro.fazNumero2();

	}

}
