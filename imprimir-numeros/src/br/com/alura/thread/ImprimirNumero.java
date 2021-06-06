package br.com.alura.thread;

public class ImprimirNumero implements Runnable {

	@Override
	public void run() {


		for(int i = 1 ; i <= 1000 ; i++) {
			Thread threadAtual = Thread.currentThread();
			System.out.println("O nome da thread atual é " + threadAtual.getName() + " = " + i);

		}

	}

}
