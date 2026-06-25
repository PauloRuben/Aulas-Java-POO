package aula10;

public class Reptil extends Animal {
	protected String corEscama;
	
	@Override
	public void locomover(){
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo Vegetais");
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Som de Reptil");
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	public void steCorEsmaca(String CorEscama) {
		this.corEscama = CorEscama;
	}
}
