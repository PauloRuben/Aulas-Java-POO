package aula04;

public class Aula04 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();//p1 é pessoa um, objeto p1
		p1.setNumConta(1111);
		p1.setDono("Juliana");
		p1.abrirConta("CC");//NA REGRA DE NEGOCIA A CC Já COMEÇA COM 50 REAIS
	
		//NA REGRA DE NEGOCIO A CP JÁ COMEÇA COM 150 REAIS
		//NA REGRA DE NEGOCIO QUANDO SE COLOCA UMA CONTA ELA É ABERTA
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("João");
		p2.abrirConta("CP");
		
		p1.depositar(100); //Fazer um deposito
		p2.depositar(500); 
		
		p2.sacar(100); //Fazendo um saque
		p1.sacar(150);
		//p2.sacar(1000);//Saldo insuficiente
		
		p1.fecharConta();
		
		//Estado Atual da conta após a transições
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
