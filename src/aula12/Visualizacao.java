package aula12;

public class Visualizacao {
	private Aluno espectador;
	private Video filme;
	public Visualizacao( Aluno espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		//add video assistindo aut. no sistema
		
		this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);
		//add views auto. no sistema
		
		this.filme.setViews(this.filme.getViews() + 1);
	}
	public void avaliar() {
		//Avaliação auto. 4 se não passar
		this.filme.setAvaliacao(5);
		
	}
	
	public void avaliar(int nota){
		//se passar a nota
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		//se assitir a porcentagem do video
		int tot = 0;
		if(porc <= 20) {
			tot=3;
		}else if(porc <=50){
			tot = 5;
		}else if(porc <=90) {
			tot = 8;
		}else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
	@Override
	public String toString() {
		return "Visualizacao [espectador= " + espectador + ""
				+ ", filme= " + filme + "]";
	}
	
	

}
