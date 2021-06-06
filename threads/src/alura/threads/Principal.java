package alura.threads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Isso é a thread main");
		
		Runnable imprimeString =  new ImprimeString();
		Thread threadImprimeString = new Thread(imprimeString , "Imprime String");
		threadImprimeString.start();
		Thread.sleep(550000);
	}
}
