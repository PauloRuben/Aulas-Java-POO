package aula10;

public class Peixe extends Animal{
	protected String corEscama;
	
	@Override
	public void locomover(){
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo Substancias");
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Peixe não faz Som");
	}
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhas");
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	
	public void steCorEsmaca(String CorEscama) {
		this.corEscama = CorEscama;
	}
}
