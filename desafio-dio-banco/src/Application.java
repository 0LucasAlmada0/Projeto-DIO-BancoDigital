
public class Application {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Luciana");
		
		Conta contaCorrente = new ContaCorrente(cliente1);  //Instanciando as contas bancarias
		Conta contaPoupanca = new ContaPoupanca(cliente2);
		
		contaCorrente.depositar(1000);
		contaCorrente.imprimirExtrato();     //Testando o Deposito
		
		contaCorrente.sacar(500);
		contaCorrente.imprimirExtrato();	 //Testando o Saque
		
		
		contaCorrente.transferir(300, contaPoupanca);
		contaCorrente.imprimirExtrato();     	
		contaPoupanca.imprimirExtrato();	 //Testando a transferencia
		
		
		contaCorrente.imprimirExtrato();     
		contaPoupanca.imprimirExtrato();	 //Testando o Extrato
		
		
		//Prefiro deixar o código bem explícito e fácil de ler, mesmo sabendo que 
		//quanto mais enxuto e encapsulado o código, teria uma melhor boa prática :)
	}

}
