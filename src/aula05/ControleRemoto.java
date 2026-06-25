package aula05;

public class ControleRemoto implements Controlador {
	
	//AULA DE ENCAPSULAMENTO
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		
		this.volume = 50;//o volume começa com 50
		this.ligado = true; //
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(true);
	}

	@Override
	public void abrirMenu() {
		System.out.println("-------------MENU-------------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume() );
		for(int i = 0;i <= this.getVolume(); i +=10) {
			System.out.print(" |");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu.....");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
			
		}else {
			System.out.println("Impossivel aumentar o volume");
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossivel ligar");
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.getLigado() && !( this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Não consigui reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
		
	}
	
	
	
}
