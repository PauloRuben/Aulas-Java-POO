package aula01;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//CRIACAO DE METODOS SEM RETORNO
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
