package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Principal {

	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.inicializa();

	}

	
	private void inicializa() {
		
		Conta contaOrigem  = new Conta(1, 0.0);
		contaOrigem.setPessoa(new Pessoa("Alfredo", "6545458"));
		contaOrigem.setSaldo(0.0);
		contaOrigem.setNumero(1716);
		
		Conta contaDestino = new Conta(2, 0.0);		
		contaDestino.setPessoa(new Pessoa("Joao", "12345678"));
		contaDestino.setSaldo(2000.0);
		contaDestino.setNumero(2214);

		
		
		
		System.out.println(contaOrigem);
		System.out.println(contaDestino);
		System.out.println("");
		
		System.out.println(contaOrigem.getPessoa());
		System.out.println(contaDestino.getPessoa());
		System.out.println("");
				
		
		System.out.println("Conta Origem  -> "+ contaOrigem.getNumero() + "     Saldo da conta = " + contaOrigem.getSaldo());
		System.out.println("Conta Destino -> "+ contaDestino.getNumero()+ "     Saldo da conta = " + contaDestino.getSaldo());	
		
		
		Transferencia novaTrasferencia = new Transferencia(1, contaOrigem, contaDestino, 500.0, "TEF");
		novaTrasferencia.transferir();
		novaTrasferencia.exibirDados();
	}
}