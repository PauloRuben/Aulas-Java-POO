package aula02;

public class Caneta {
	
	//ATRIBUTOS
	//USANDO PUBLICO, PRIVADO E PROTEGIDO
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	//CRIACAO DE TMETODOS SEM RETORNO
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada?: " + this.tampada);
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;//this é o nome do objeto que chamou no caso o c1
	}
	
	void destampar() {
		this.tampada = false;
	}
}
