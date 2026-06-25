package aula04;

public class ContaBanco {
	
	//ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//MÉTODOS PERSONALIZADOS
	public void estadoAtual() {
		System.out.println("--------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void abrirConta(String t) {//A pessoa escolhe se quer CC(Conta Corrente) CP(Conta Poupança)
		this.setTipo(t);
		this.setStatus(true);
		if("CC".equals(t)) { //CC é uma Conta Corrente
			this.setSaldo(50); //saldo recebe 50 reais 
			System.out.println("Você abrio uma conta corrente(CC)");
		} else if("CP".equals(t)) { //CP é Conta poupança
			this.setSaldo(150);//Saldo recebe 150 reais
			System.out.println("Você abrio uma conta poupança(CP)");
		}
		System.out.println("Conta berta com sucesso!" );
	}
	
	public void fecharConta() {//Situaça ocorre se a pessoa quer fechar a conta
		//para fechar ela deve ter a conta zerada
		if(this.getSaldo() > 0 ) {
			System.out.println("Conta não pode ser fechada Porque"
					+ " ainda tem saldo");
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem"
					+ "débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v) {//A pessoa quanto dinheiro quer depositar
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() +v);//Saldo recebe mais v
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");// se a conta for fechada não ocorre a transição
		}
	}
	
	public void sacar(float v) {//Aqui ocorre o saque
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {// Se o saldo for maior ou igual a v
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo Insuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	
	public ContaBanco() {
		this.saldo = 0;
		this.status =false;
	}

	public void pagarMensal() {//O pagamentoi mensal da conta
		int v = 0;
		if(this.getTipo() == "CC") {//Se for conta corrente
			v = 12;
		} else if(this.getTipo() == "CP") {//Se for conta poupança
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);//metodo para Pagar mensalidade
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
