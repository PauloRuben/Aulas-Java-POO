package aula11;

public class Lobo extends Mamifero{
	
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuuuuuuuuuu");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida" ) || frase.equals("Olá")) {
			System.out.println("Abanar Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	

}
