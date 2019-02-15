package com.target.treinamento.orientacaoobjeto.multiprocessamento;

public class Principal {

	Integer total = 0;
	
	class Dado {
		public synchronized void exibir(Integer str) {
			if (total == 0) {
				System.out.print(""+str);
			} else {
				System.out.print("+"+str);
			}
			total = total + str;
			
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	class ThreadExemplo extends Thread {
		Integer str;
		Dado dado;
		public ThreadExemplo(Dado dado, Integer str) {
			this.dado = dado;
			this.str = str;	
			start();
		}
		
		@Override
		public void run() {			
			dado.exibir(str);

		}
	}
		
	public static void main(String[] args) {
		new Principal().inicializa();
	}

	private void inicializa() {
		Dado dado = new Dado();
		
		ThreadExemplo t1 = new ThreadExemplo(dado, 1);
		ThreadExemplo t2 = new ThreadExemplo(dado, 2);
		ThreadExemplo t3 = new ThreadExemplo(dado, 3);
		ThreadExemplo t4 = new ThreadExemplo(dado, 4);
		ThreadExemplo t5 = new ThreadExemplo(dado, 5);
		ThreadExemplo t6 = new ThreadExemplo(dado, 6);
		ThreadExemplo t7 = new ThreadExemplo(dado, 7);
		ThreadExemplo t8 = new ThreadExemplo(dado, 8);
		ThreadExemplo t9 = new ThreadExemplo(dado, 9);

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" = " + total);
	}
}