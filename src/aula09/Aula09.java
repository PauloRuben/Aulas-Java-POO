package aula09;

public class Aula09 {
	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Ana");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}
}
