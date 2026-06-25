package aula08;

public class ProjetoPessoa {
	public static void main(String[] args) {
		Pessoa p1 =  new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Fabiana");
		p3.setNome("Adriano");
		p4.setNome("Maria");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		//EXUCACAO DESTE CODIGO NA PROXIMA FASE	
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		
		//p1.receberAumento(550.20f);//pessoa não pode receber aumento
		//p2.mudaTrabalho();esta função não pode ser feita
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
