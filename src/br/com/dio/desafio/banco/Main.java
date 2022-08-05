package br.com.dio.desafio.banco;

public class Main {

	public static void main(String[] args) {
		Cliente julia = new Cliente();
		julia.setNome("Julia");
			
		Conta cc = new ContaCorrente(julia);
		Conta poupanca = new ContaPoupanca(julia); 
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	
	}


}
