package br.com.alura.thread;

public class Principal {

	public static void main(String[] args) {

		new Thread(new ImprimirNumero(),"primeira thread:").start();
		new Thread(new ImprimirNumero(),"segunda thread").start();
	}
}
