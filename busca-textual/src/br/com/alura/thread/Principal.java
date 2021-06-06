package br.com.alura.thread;

public class Principal {
	public static void main(String[] args) {
		String nome = "da";
		Thread threadAssinatura1 = new Thread(new TarefaBuscatextual("assinaturas1.txt",nome));
		Thread threadAssinatura2 = new Thread(new TarefaBuscatextual("assinaturas2.txt",nome));
		Thread threadAssinatura3 = new Thread(new TarefaBuscatextual("autores.txt",nome));
	
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAssinatura3.start();
		
	}
}
