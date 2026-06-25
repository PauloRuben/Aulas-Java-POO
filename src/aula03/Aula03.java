package aula03;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f );
		c1.status();
		
		/*c1.setModelo("Bic");
		c1.setPonta(0.5f);
		System.out.println("Tenho uma caneta " + c1.getModelo() + "de ponta " + c1.getPonta());*/
		
		System.out.println("--------------------");
		
		Caneta c2 = new Caneta("Host", "Laranja", 1.5f);
		c2.status();
	}

}
