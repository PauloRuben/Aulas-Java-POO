package aula12;

public class ProjetoFinal {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Aluno a[] = new Aluno[2];
		
		a[0] = new Aluno("Julia", 22, "F", "Juju");
		a[1] = new Aluno("Julio", 21, "M", "Julius");
		
		//PARTE 02 DO SISTEMA
		
		Visualizacao vis[] = new Visualizacao[5];
		//Aluno vendo o video X, Julia asisti HTML
		vis[0] = new Visualizacao(a[0], v[2]);
		vis[0].avaliar();//segunda parte do exe 
		System.out.println(vis[0].toString());
		
		//mesmo aluno vendo outro video, Julia assistindo PHP
		vis[1] = new Visualizacao(a[0], v[1]);
		//segunda parte de exe. Julia assistiu 87% do video
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		 //QUANDO JA TEM UMA AVALIAÇÃO O SISTEMA SOMA
		
	}
}
