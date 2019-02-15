package com.target.treinamento.orientacaoobjeto.multiprocessamento;

public class Principal {

	class MinhaThread extends Thread {
		@Override
		public void run() {
			System.out.println("Thread 1");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		System.out.println("Thread 2");
		}
	}
	
	public static void main(String[] args) {
		new Principal().inicializa();
	}


	private void inicializa() {
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
