package aula01;

public class Aula01 {

	public static void main(String[] args) {
		//INSTANCIANDO UMA CLASSE
		
		Caneta c1 = new Caneta(); //obejto c1 e classe Caneta
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		//c1.tampada = false;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		System.out.println("----------------------");
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preto";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
