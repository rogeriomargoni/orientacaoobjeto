package com.target.treinamento.orientacaoobjeto.multiprocessamento;

public class Principal_2 {

	public static void main(String[] args) {

		Thread nome = new Thread(new Runnable() {

		public void run() {

			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread   "+Thread.currentThread().getName());					
			}
			
		}
	}, "Nome da Thread");

	nome.start();
	}
}