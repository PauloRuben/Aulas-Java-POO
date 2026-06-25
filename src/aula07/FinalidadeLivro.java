package aula07;

public class FinalidadeLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];//Duas pessoas
		Livro[] l = new Livro[3];//Tres Livros
		
		p[0] = new Pessoa("Pedro", 22, "M");
		//OS MESMOS PARAMETROS DA CLASSE PESSOA
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300,
				p[0]);
		l[1] = new Livro("Aprendendo PHP", "José da Silva", 400,
				p[1]);
		l[2] = new Livro("Aprendendo RUBY", "José da Silva", 800,
				p[0]);
		l[0].abrir();//Abrindo livro
		l[0].folhear(200);//Folhar a folha até a pagina 200
		l[0].avancaPag();//Avançando mais uma pagina, olhe o console
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
	}
}
