package com.target.treinamento.orientacaoobjeto.multiprocessamento;

public class Principal {

	public static void main(String[] args) {

		//thread principal
		Thread t = Thread.currentThread();
		
		t.setName("  Minha Thread  ");
		
		System.out.println(t);
		
		//Nova thread
		Thread minhaNovaThread = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Minha Nova Thread");
				Thread t = Thread.currentThread();
				System.out.println(t);
				
			}
		}, "  TargetTrust  "  );
		
		
		minhaNovaThread.start();
		
	}
}
