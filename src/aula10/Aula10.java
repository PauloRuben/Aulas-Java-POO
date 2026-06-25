package aula10;

public class Aula10 {
	public static void main(String[] args) {
		//Animal n = new Animal();
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
		m.setPeso(35.5f);
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		c.locomover();
		k.locomover();
		k.emitirSom();//Polimorfismo
	}
}
