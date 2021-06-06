package banheiro;

public class Banheiro {

	private boolean estaSujo = true;

	public void fazNumero1() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			if (estaSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " fazendo coisa rapida");
			dormeUmPouco(5000L);
			
			this.estaSujo = true;
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " enchugando as maos");
			System.out.println(nome + " saindo do banheiro");
		}

	}

	public void dormeUmPouco(Long milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fazNumero2() {

		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			while(estaSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " fazendo coisa demorada");
			
			dormeUmPouco(10000L);
			
			this.estaSujo = true;
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " enchugando as maos");
			System.out.println(nome + " saindo do banheiro");
		}
	}

	public void limpaBanheiro() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			while(!this.estaSujo) {
				System.out.println(nome + "não esta sujo, vou sair");
				;
				return;
			}
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " limpando o banheiro");
			this.estaSujo = false;
		
			dormeUmPouco(10000L);
			 
			System.out.println(nome + " saindo do banheiro");
			this.notifyAll();

		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, banheiro está sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
